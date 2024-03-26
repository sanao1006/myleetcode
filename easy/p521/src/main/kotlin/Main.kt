package com.api

import kotlin.math.max

class Solution {
    fun findLUSlength(a: String, b: String): Int =
        if(a==b) -1 else max(a.length,b.length)

}