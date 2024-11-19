package com.test

import kotlin.test.Test
import kotlin.test.assertNotNull

class Test {
    @Test
    fun test() {
        // In the classpath
        val fooTxt = Thread.currentThread().contextClassLoader.getResource("foo.txt")
        assertNotNull(fooTxt)

        // In the classpath
        val barTxt = Thread.currentThread().contextClassLoader.getResource("bar.txt")
        assertNotNull(barTxt)
    }
}
