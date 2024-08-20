package org.renerod1.leetcode.problem_list_10

class App {
    fun main() {
        isMatch("aa", "a")
        isMatch("aa", "a*")
        isMatch("ab", ".*")
        isMatch("abc", "a***abc")
    }

    fun isMatch(s: String, p: String): Boolean {
        var newP = p
        while (newP.contains("**")) {
            newP = newP.replace("**", "*")
        }
        return s.matches(newP.toRegex())
    }
}
