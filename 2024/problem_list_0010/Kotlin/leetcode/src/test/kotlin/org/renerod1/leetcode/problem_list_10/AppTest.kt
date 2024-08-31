package org.renerod1.leetcode.problem_list_10

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AppTest {

    private lateinit var app: App

    @BeforeEach
    fun configureApp() {
        app = App()
    } 

    @Test
    fun case1() {
        assertEquals(false, app.isMatch("aa", "a"))
    }

    @Test
    fun case2() {
        assertEquals(true, app.isMatch("aa", "a*"))
    }

    @Test
    fun case3() {
        assertEquals(true, app.isMatch("ab", ".*"))
    }

    @Test
    fun case4() {
        assertEquals(true, app.isMatch("abc", "a***abc"))
    }
}