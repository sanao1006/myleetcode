package com.api
class Solution {
    fun checkRecord(s: String): Boolean {
        if(s.length > 2) {
            var isAbs1 = false
            var isAbs2 = false
            var isAbs3 = false
            for(i in (2..s.length-1)) {
                if(s[i-2] != 'L') isAbs1 = false
                else isAbs1 = true

                if(s[i-1] != 'L') isAbs2 = false
                else isAbs2 = true

                if(s[i] != 'L') isAbs3 = false
                else isAbs3 = true
                if(isAbs1 && isAbs2 && isAbs3) return false
            }
        }
        if(s.count { it == 'A' } >= 2) return false
        return true
    }
}