package app.umichan.likeslackrenewal.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.ChannelRowBinding
import app.umichan.likeslackrenewal.ui.viewmodel.ChannelViewModel

class ChannelListAdapter(val isUnreadChannel: Boolean = false): RecyclerView.Adapter<ChannelListAdapter.ChannelListViewHolder>() {
    private var channelViewModel: ChannelViewModel? = null

    fun setChannelViewModel(viewModel: ChannelViewModel) {
        this.channelViewModel = viewModel
    }

    override fun getItemCount() = channelViewModel?.channelCount(isUnreadChannel) ?: 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChannelListViewHolder {
        val binding = DataBindingUtil.inflate<ChannelRowBinding>(
            LayoutInflater.from(parent.context),
            R.layout.channel_row,
            parent,
            false
        )

        return ChannelListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChannelListViewHolder, position: Int) {
        holder.binding.viewModel = channelViewModel
        holder.binding.isUnreadChannel = isUnreadChannel
        holder.binding.position = position
        holder.binding.executePendingBindings()
    }

    class ChannelListViewHolder(val binding: ChannelRowBinding): RecyclerView.ViewHolder(binding.root)
}