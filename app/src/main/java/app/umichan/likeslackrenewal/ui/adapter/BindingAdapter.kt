package app.umichan.likeslackrenewal.ui.adapter

import android.graphics.Typeface
import android.widget.TextView
import androidx.databinding.BindingAdapter

object BindingAdapter {
    @BindingAdapter("isBold")
    @JvmStatic
    fun setBold(v: TextView, isBold: Boolean) {
        if (isBold) {
            v.setTypeface(null, Typeface.BOLD)
        } else {
            v.setTypeface(null, Typeface.NORMAL)
        }
    }
}