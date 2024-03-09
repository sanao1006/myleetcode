package com.api

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val mps = s.groupingBy { it }.eachCount()
        val mpt = t.groupingBy { it }.eachCount()
        var ans = ' '
        mpt.forEach {c, v ->
            if(!mps.containsKey(c)) ans = c
            else {
                if (mps[c] != v) ans = c
            }
        }
        return ans

    }
}
