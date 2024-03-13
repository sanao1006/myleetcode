import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(listOf(5,6), s.findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1)))

    @Test
    fun case2() = assertEquals(listOf(2), s.findDisappearedNumbers(intArrayOf(1,1)))
}