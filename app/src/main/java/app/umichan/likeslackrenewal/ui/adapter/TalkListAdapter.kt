package app.umichan.likeslackrenewal.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.TalkRowBinding

class TalkListAdapter : RecyclerView.Adapter<TalkListAdapter.TalkListViewHolder>() {
    override fun getItemCount() = 30

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TalkListViewHolder {
        val binding = DataBindingUtil.inflate<TalkRowBinding>(
            LayoutInflater.from(parent.context),
            R.layout.talk_row,
            parent,
            false
        )

        return TalkListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TalkListViewHolder, position: Int) {
    }

    class TalkListViewHolder(val binding: TalkRowBinding) :
        RecyclerView.ViewHolder(binding.root)
}