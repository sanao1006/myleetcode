package com.api

class Solution {
    fun detectCapitalUse(word: String): Boolean {
        if (word.length == 1) return true
        if(word[0].isUpperCase()){
            if(word.slice((1..word.length-1)).all { it.isUpperCase() }) return true
            if(word.slice((1..word.length-1)).all { it.isLowerCase() }) return true
            return false
        }
        if(word.any { it.isUpperCase() }) return false
        return true
    }
}