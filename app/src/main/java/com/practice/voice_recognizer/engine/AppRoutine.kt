package com.practice.voice_recognizer.engine

import kotlin.concurrent.thread

class AppRoutine {

    fun startRecording() {
        thread (isDaemon = true) {
            val signalConverter = SignalConverter()
        }

    }
}