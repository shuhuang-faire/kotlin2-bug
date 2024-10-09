import org.apache.commons.lang3.StringUtils

fun testFixtures() {
    val str = "   Kotlin is Awesome!   "
    val trimmedStr = StringUtils.strip(str)
    println("Original: '$str'")
    println("Trimmed: '$trimmedStr'")
    // Output:
    // Original: '   Kotlin is Awesome!   '
    // Trimmed: 'Kotlin is Awesome!'
}

