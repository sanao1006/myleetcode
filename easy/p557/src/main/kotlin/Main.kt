package com.api

class Solution {
    fun reverseWords(s: String): String = s.split(" ").joinToString(" ") { it.reversed() }
}
