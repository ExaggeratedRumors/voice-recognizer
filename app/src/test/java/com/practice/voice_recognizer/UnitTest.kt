package com.practice.voice_recognizer
import com.practice.voice_recognizer.utils.Complex
import org.junit.Test

import org.junit.Assert.*


class UnitTest {
    @Test
    fun complex_validation() {
        val a = 5.0
        val b = 4.0
        val delta = 1e-8
        val firstComplex = Complex(a,b)
        val secondComplex = Complex(b,a)
        assertEquals(a, firstComplex.real, delta)
        assertEquals(b, firstComplex.imag, delta)
        val diff = firstComplex - secondComplex
        assertEquals(1.0, diff.real, delta)
        assertEquals(-1.0, diff.imag, delta)
        val multiplication = firstComplex * secondComplex
        assertEquals(0.0, multiplication.real, delta)
        assertEquals(41.0, multiplication.imag, delta)
    }
}