import kotlinx.datetime.Clock
import kotlin.test.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun test() {
        val now = Clock.System.now()
        assertEquals(now, now)
    }
}