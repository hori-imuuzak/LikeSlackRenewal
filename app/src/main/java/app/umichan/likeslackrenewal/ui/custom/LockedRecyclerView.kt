package app.umichan.likeslackrenewal.ui.custom

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LockedRecyclerView : RecyclerView {
    constructor(context: Context) : super(context, null, 0)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        layoutManager = LockedLayoutManager(context)
    }

    class LockedLayoutManager(context: Context) : LinearLayoutManager(context) {
        override fun canScrollVertically() = false
    }
}