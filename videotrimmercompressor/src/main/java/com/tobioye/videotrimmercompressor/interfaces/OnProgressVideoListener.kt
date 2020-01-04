package com.tobioye.videotrimmercompressor.interfaces

interface OnProgressVideoListener {
    fun updateProgress(time: Int, max: Int, scale: Float)
}