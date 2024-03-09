import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class test {
    private val solution = Solution()

    @Test
    fun case1(){
        assertEquals(solution.findTheDifference("abcd", "abcde"), 'e')
    }

    @Test
    fun case2(){
        assertEquals(solution.findTheDifference("", "y"), 'y')
    }
}
