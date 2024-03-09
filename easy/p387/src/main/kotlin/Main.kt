
class Solution {
    fun firstUniqChar(s: String): Int {
        val mp = s.groupingBy { it }.eachCount()
        for(i in 0..s.length-1) {
            if(mp[s[i]] == 1) return i
        }
        return -1
    }
}
