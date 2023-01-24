package dev.punclev.algorithms.adder

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.random.Random

class AdderTest {

    @Test
    fun `should pass assignment`() {
        assertEquals("5859874482048838473822930854632165381954416493075065395941912219", Adder().sum("3141592653589793238462643383279502884197169399375105820974944592", "2718281828459045235360287471352662497757247093699959574966967627"))
    }

    @Test
    fun `should sum with guaranteed carry over`() {
        assertEquals("199999998", Adder().sum("99999999", "99999999"))
    }

    @Test
    fun `should work with 0`() {
        assertEquals("99999999", Adder().sum("0", "99999999"))
    }
    @Test
    fun `commutative property`() {
        val a = Random.nextInt(0, 10_000_000)
        val b = Random.nextInt(0, 10_000_000)
        assertEquals(Adder().sum(b.toString(), a.toString()), Adder().sum(a.toString(), b.toString()))
    }
}