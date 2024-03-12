import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals("134", s.addStrings("11", "123"))

    @Test
    fun case2() = assertEquals("533", s.addStrings("456", "77"))

    @Test
    fun case3() = assertEquals("0", s.addStrings("0", "0"))
}