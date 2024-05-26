package org.renerod1.leetcode.problem_list_10

class App {
    fun main() {
        println(isMatch("aa", "a"))
        println(isMatch("aa", "a*"))
        println(isMatch("ab", ".*"))
        println(isMatch("abc", "a***abc"))
    }

    fun isMatch(s: String, p: String): Boolean {
        var newP = p
        while (newP.contains("**")) {
            newP = newP.replace("**", "*")
        }
        return s.matches(newP.toRegex())
    }
}
