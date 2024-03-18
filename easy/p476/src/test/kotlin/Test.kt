import com.api.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val s = Solution()

    @Test
    fun case1() = assertEquals(2, s.findComplement(5))

    @Test
    fun case2() = assertEquals(1, s.findComplement(2))
}