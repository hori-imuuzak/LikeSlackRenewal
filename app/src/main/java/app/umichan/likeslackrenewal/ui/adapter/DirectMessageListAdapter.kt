package app.umichan.likeslackrenewal.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.DirectMessageRowBinding

class DirectMessageListAdapter : RecyclerView.Adapter<DirectMessageListAdapter.MentionListViewHolder>() {
    override fun getItemCount() = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MentionListViewHolder {
        val binding = DataBindingUtil.inflate<DirectMessageRowBinding>(
            LayoutInflater.from(parent.context),
            R.layout.direct_message_row,
            parent,
            false
        )

        return MentionListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MentionListViewHolder, position: Int) {
    }

    class MentionListViewHolder(val binding: DirectMessageRowBinding) :
        RecyclerView.ViewHolder(binding.root)
}