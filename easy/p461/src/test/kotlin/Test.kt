import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(2, s.hammingDistance(1,4))

    @Test
    fun case2() = assertEquals(1, s.hammingDistance(3,1))

}