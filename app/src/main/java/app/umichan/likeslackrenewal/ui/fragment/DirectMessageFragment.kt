package app.umichan.likeslackrenewal.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.FragmentDirectMessageBinding
import app.umichan.likeslackrenewal.ui.adapter.DirectMessageListAdapter

class DirectMessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDirectMessageBinding>(
            inflater,
            R.layout.fragment_direct_message,
            container,
            false
        )

        binding.list.adapter = DirectMessageListAdapter()
        binding.fab.setOnClickListener {  }

        return binding.root
    }
}