package com.api

class Solution {
    fun findComplement(num: Int): Int {
        val bin = num.toString(2)
        var ans = ""
        for(i in bin) {
            ans += if(i == '1') "0"
            else "1"
        }
        return ans.toInt(2)
    }
}