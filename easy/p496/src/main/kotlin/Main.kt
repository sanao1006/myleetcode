package com.api

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val mp = nums2.zip(0..<nums2.size).toMap()
        var ans = mutableListOf<Int>()
        for(i in nums1) {
            val n = mp[i]!!
            val sl = nums2.slice((n..nums2.lastIndex))
            val num = sl.firstOrNull{ it > i }
            if(num == null) ans.add(-1)
            else ans.add(num)
        }
        return ans.toIntArray()
    }
}