package app.umichan.likeslackrenewal.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChannelViewModel: ViewModel() {
    private val _unreads = MutableLiveData<List<String>>()
    val unreads: LiveData<List<String>> = _unreads

    private val _channels = MutableLiveData<List<String>>()
    val channels: LiveData<List<String>> = _channels

    fun channelCount(isUnreadChannel: Boolean): Int {
        return if (isUnreadChannel) {
            _unreads.value?.size ?: 0
        } else {
            _channels.value?.size ?: 0
        }
    }

    fun getChannelName(position: Int, isUnreadChannel: Boolean): String {
        return if (isUnreadChannel) {
            _unreads.value?.let { it[position] } ?: ""
        } else {
            _channels.value?.let { it[position] } ?: ""
        }
    }

    fun loadChannels() {
        _unreads.value = listOf(
            "random",
            "general",
            "toyota-86",
            "toyota-supra",
            "toyota-vitz",
            "subaru-brz",
            "subaru-impreza",
            "subaru-legacy",
            "nissan-skyline",
            "nissan-fairlady-z",
            "nissan-silvia",
            "honda-s2000",
            "honda-civic",
            "honda-integra"
        )
        _channels.value = listOf(
            "mazda-rx7",
            "mazda-rx8",
            "mazda-roadster",
            "porsche-boxster",
            "porsche-cayman",
            "porsche-911"
        )
    }

    var uiEvent: UIEvent? = null
    interface UIEvent {
        fun onClickChannel()
    }
}