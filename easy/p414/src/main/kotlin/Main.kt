package com.api

fun main() {
    println("Hello World!")
}

class Solution {
    fun thirdMax(nums: IntArray): Int {
        val dnums = nums.distinct().sorted()
        if(dnums.size < 3) return nums.max()
        return dnums[dnums.size-3]
    }
}
