package app.umichan.likeslackrenewal.ui.activity

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.ActivityTalkBinding
import app.umichan.likeslackrenewal.ui.adapter.TalkListAdapter
import com.liuguangqiang.swipeback.SwipeBackLayout

class TalkActivity : AppCompatActivity() {

    companion object {
        fun start(from: Activity) {
            val intent = Intent(from, TalkActivity::class.java)
            from.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(from).toBundle())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityTalkBinding>(this, R.layout.activity_talk)
        binding.swipeBack.setDragEdge(SwipeBackLayout.DragEdge.LEFT)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "Message"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.list.adapter = TalkListAdapter()
    }
}
