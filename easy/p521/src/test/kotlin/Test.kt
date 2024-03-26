import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(3, s.findLUSlength("aba", "cdc"))

    @Test
    fun case2() = assertEquals(-1, s.findLUSlength("aaa", "aaa"))
}