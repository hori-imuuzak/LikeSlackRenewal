package app.umichan.likeslackrenewal.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.FragmentMentionBinding
import app.umichan.likeslackrenewal.ui.adapter.MentionListAdapter

class MentionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMentionBinding>(
            inflater,
            R.layout.fragment_mention,
            container,
            false
        )

        binding.list.adapter = MentionListAdapter()
        binding.fab.setOnClickListener {  }

        return binding.root
    }
}