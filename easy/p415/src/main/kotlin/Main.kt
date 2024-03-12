package com.api

import kotlin.math.max

// 2024/03/12 ×
class Solution {
    fun addStrings(num1: String, num2: String): String {
        var ans = ""
        var i = num1.length.dec()
        var j = num2.length.dec()

        var c = 0
        while (i >= 0 || j >= 0 || c != 0) {
            var iv = if(i >= 0) num1[i] - '0' else 0
            var jv = if(j >= 0) num2[j] - '0' else 0
            i--
            j--
            var total = iv+jv+c
            ans = (total % 10).toString() + ans
            c = total/10
        }
        return ans

    }
}