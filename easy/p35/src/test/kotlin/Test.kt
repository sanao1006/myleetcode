import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(2, s.searchInsert(intArrayOf(1,3,5,6), 5))

    @Test
    fun case2() = assertEquals(1, s.searchInsert(intArrayOf(1,3,5,6), 2))
    @Test
    fun case3() = assertEquals(4, s.searchInsert(intArrayOf(1,3,5,6), 7))

}