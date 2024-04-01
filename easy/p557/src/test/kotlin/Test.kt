import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals("s'teL ekat edoCteeL tsetnoc", s.reverseWords("Let's take LeetCode contest"))

    @Test
    fun case2() = assertEquals("rM gniD", s.reverseWords("Mr Ding"))
}