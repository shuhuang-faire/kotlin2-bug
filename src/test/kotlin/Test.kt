import kotlinx.datetime.Clock
import kotlin.test.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun test() {
        val us = Thread.currentThread().contextClassLoader.getResources("").toList().map { it.toURI().toURL() }

        us.forEach {
            println(it)
        }
        val now = Clock.System.now()
        assertEquals(now, now)
    }
}