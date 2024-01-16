package com.bittelasia.vlc.listener

import com.bittelasia.vlc.model.VideoInfo

interface OnPlayerListener {
    fun playerLoad(message: String)
    fun playerStopped(videoInfo: VideoInfo?, message: String)
}