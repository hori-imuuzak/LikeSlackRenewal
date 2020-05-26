package app.umichan.likeslackrenewal.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.FragmentChannelBinding
import app.umichan.likeslackrenewal.ui.activity.TalkActivity
import app.umichan.likeslackrenewal.ui.adapter.ChannelListAdapter
import app.umichan.likeslackrenewal.ui.viewmodel.ChannelViewModel

class ChannelFragment : Fragment() {

    private lateinit var viewModel: ChannelViewModel

    private lateinit var unreadChannelAdapter: ChannelListAdapter
    private lateinit var readChannelAdapter: ChannelListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentChannelBinding>(
            inflater,
            R.layout.fragment_channel,
            container,
            false
        )

        viewModel = ViewModelProvider(this).get(ChannelViewModel::class.java)

        setupUI(binding)
        observe()

        viewModel.loadChannels()

        return binding.root
    }

    private fun setupUI(binding: FragmentChannelBinding) {
        binding.lifecycleOwner = viewLifecycleOwner

        unreadChannelAdapter =
            ChannelListAdapter(isUnreadChannel = true).apply { setChannelViewModel(viewModel) }
        readChannelAdapter =
            ChannelListAdapter().apply { setChannelViewModel(viewModel) }

        binding.unreadList.adapter = unreadChannelAdapter
        binding.channelList.adapter = readChannelAdapter

        binding.fab.setOnClickListener { }

        viewModel.uiEvent = object : ChannelViewModel.UIEvent {
            override fun onClickChannel() {
                activity?.let { TalkActivity.start(it) }
            }
        }
    }

    private fun observe() {
        viewModel.unreads.observe(viewLifecycleOwner, Observer {
            unreadChannelAdapter.notifyDataSetChanged()
        })

        viewModel.channels.observe(viewLifecycleOwner, Observer {
            readChannelAdapter.notifyDataSetChanged()
        })
    }
}