import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class test {
    private val solution = Solution()
    @Test
    fun case1(){
        assertEquals(solution.firstUniqChar("leetcode"), 0)
    }

    @Test
    fun case2(){
        assertEquals(solution.firstUniqChar("loveleetcode"), 2)
    }

    @Test
    fun case3(){
        assertEquals(solution.firstUniqChar( "aabb"), -1)
    }

}