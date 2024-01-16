package com.bittelasia.vlc.presenter.fragment

import com.bittelasia.vlc.fragment.PlayerStatusFragment


class TVStatusFragment: PlayerStatusFragment() {
    override fun displayChannel(): Boolean {
        return false
    }
}