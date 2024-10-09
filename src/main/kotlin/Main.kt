package com.test

import org.apache.commons.lang3.StringUtils

fun main() {
    val str = "   Kotlin is Awesome!   "
    val trimmedStr = StringUtils.strip(str)
    println("Original: '$str'")
    println("Trimmed: '$trimmedStr'")
    // Output:
    // Original: '   Kotlin is Awesome!   '
    // Trimmed: 'Kotlin is Awesome!'
}
