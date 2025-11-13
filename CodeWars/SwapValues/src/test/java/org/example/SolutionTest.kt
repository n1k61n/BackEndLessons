package org.example

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSomething() {
        val args: Array<Int?> = arrayOf<Int>(1, 2) as Array<Int?>

        val r = Swapper(args)
        r.swapValues()
        Assert.assertEquals("Failed swapping numbers", 2, r.arguments[0])
        Assert.assertEquals("Failed swapping numbers", 1, r.arguments[1])
    }
}