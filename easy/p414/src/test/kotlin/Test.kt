import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()
    @Test
    fun case1() = assertEquals(1, s.thirdMax(intArrayOf(3,2,1)))

    @Test
    fun case2() = assertEquals(2, s.thirdMax(intArrayOf(1,2)))

    @Test
    fun case3() = assertEquals(1, s.thirdMax(intArrayOf(2,3,3,1)))
}