package com.api

// ref: https://medium.com/@ignaciobartol/leetcode-392-is-subsequence-c71c6ae9c5af

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s.isEmpty()) return true
        var si = 0
        var ti = 0
        while(si < s.length && ti < t.length) {
            if(s[si] == t[ti]) si++
            ti++
        }
        return si == s.length
     }
}