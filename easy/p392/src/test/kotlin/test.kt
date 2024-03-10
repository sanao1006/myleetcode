import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val solution = Solution()

    @Test
    fun case1() {
        assertEquals(solution.isSubsequence(s = "abc", t = "ahbgdc"), true)
    }

    @Test
    fun case2() {
        assertEquals(solution.isSubsequence(s = "axc", t = "ahbgdc"), false )
    }

    @Test
    fun not_passed_test_case() {
        assertEquals(solution.isSubsequence("acb", "ahbgdc"), false)
    }
}