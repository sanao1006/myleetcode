import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(true, s.detectCapitalUse("USA"))

    @Test
    fun case2() = assertEquals(false, s.detectCapitalUse("FlaG"))
}