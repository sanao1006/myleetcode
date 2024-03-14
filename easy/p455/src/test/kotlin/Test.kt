import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(1, s.findContentChildren(intArrayOf(1,2,3), intArrayOf(1,1)))

    @Test
    fun case2() = assertEquals(2, s.findContentChildren(intArrayOf(1,2), intArrayOf(1,2,3)))
}