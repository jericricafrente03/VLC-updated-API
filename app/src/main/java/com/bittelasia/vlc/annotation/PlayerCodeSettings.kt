package com.bittelasia.vlc.annotation

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class PlayerCodeSettings(
        val channelUPCodes : IntArray,
        val channelDownCodes : IntArray,
        val channelOKCodes : IntArray,
        val channelMenuCode : Int
)
