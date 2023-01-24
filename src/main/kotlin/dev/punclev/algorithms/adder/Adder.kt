package dev.punclev.algorithms.adder

import java.lang.StringBuilder

class Adder {
    fun sum(a: String, b: String): String {
        if (b.length > a.length) {
            return sum(b, a)
        }

        val firstArgumentReversed = a.reversed()
        val secondArgumentReversed = b.reversed()
        val result = StringBuilder()

        var carry_over = 0

        for (i in 0..firstArgumentReversed.length - 1) {
            val x = firstArgumentReversed[i].digitToInt()
            val y = secondArgumentReversed.getOrElse(i, { '0' }).digitToInt()

            val sum = x + y + carry_over

            if (sum >= 10) {
                carry_over = 1
                result.append(sum - 10)
            } else {
                carry_over = 0
                result.append(sum)
            }
        }

        if (carry_over > 0) {
            result.append(carry_over)
        }

        return result.reversed().toString()
    }
}