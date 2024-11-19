import kotlinx.datetime.Clock
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class Test {
    @Test
    fun test() {
        val fooTxt = Thread.currentThread().contextClassLoader.getResource("foo.txt")
        assertNotNull(fooTxt)

        // Not in the classpath
        val barTxt = Thread.currentThread().contextClassLoader.getResource("bar.txt")
        assertNull(barTxt)
    }
}
