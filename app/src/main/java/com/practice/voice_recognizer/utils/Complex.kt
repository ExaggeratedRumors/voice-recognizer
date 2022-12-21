package com.practice.voice_recognizer.utils

import kotlin.math.atan2
import kotlin.math.hypot

class Complex (var real: Double, var imag: Double) {
    fun abs() = hypot(real, imag)
    fun phase() = atan2(imag, real)
    operator fun plus(right: Complex) =
        Complex(
            this.real + right.real,
            this.imag + right.imag
        )
    operator fun minus(right: Complex) =
        Complex(
            this.real - right.real,
            this.imag - right.imag
        )
    operator fun times(right: Complex) =
        Complex(
            this.real * right.real - this.imag * right.imag,
            this.real * right.imag + this.imag * right.real
        )



}