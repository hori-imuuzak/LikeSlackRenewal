package app.umichan.likeslackrenewal.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.MentionRowBinding

class MentionListAdapter : RecyclerView.Adapter<MentionListAdapter.MentionListViewHolder>() {
    override fun getItemCount() = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MentionListViewHolder {
        val binding = DataBindingUtil.inflate<MentionRowBinding>(
            LayoutInflater.from(parent.context),
            R.layout.mention_row,
            parent,
            false
        )

        return MentionListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MentionListViewHolder, position: Int) {
    }

    class MentionListViewHolder(val binding: MentionRowBinding) :
        RecyclerView.ViewHolder(binding.root)
}