package com.api

class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var xhex = Integer.toBinaryString(x)
        var yhex = Integer.toBinaryString(y)
        var ans = 0
        if(xhex.length > yhex.length) repeat(xhex.length-yhex.length) { yhex = "0$yhex" }
        if(yhex.length > xhex.length) repeat(yhex.length-xhex.length) { xhex = "0$xhex" }
        for(i in (0 until xhex.length)) {
            if(xhex[i] == '1' && yhex[i] == '0') ans += 1
            else if(yhex[i] == '1' && xhex[i] == '0') ans += 1
        }
        return ans
    }
}