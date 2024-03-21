import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

// なぜかローカルテストがパスしない

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(intArrayOf(-1,3,-1), s.nextGreaterElement(intArrayOf(4,1,2), intArrayOf(1,3,4,2)))

    @Test
    fun case2() = assertEquals(intArrayOf(3, -1), s.nextGreaterElement(intArrayOf(2,4), intArrayOf(1,2,3,4)))
}