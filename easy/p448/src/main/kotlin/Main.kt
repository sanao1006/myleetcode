package com.api

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val mp = nums.groupBy { it }.mapValues { it.value.size }
        var ans = mutableListOf<Int>()
        for(i in (1..nums.size)) {
            if(!mp.containsKey(i)) {
                ans.add(i)
            }
        }
        return ans
    }
}