package org.renerod1.leetcode.problem_list_10

import org.assertj.core.api.Assertions.assertThat
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
        assertThat(app.isMatch("aa", "a")).isEqualTo(false)
    }

    @Test
    fun case2() {
        assertThat(app.isMatch("aa", "a*")).isEqualTo(true)
    }

    @Test
    fun case3() {
        assertThat(app.isMatch("ab", ".*")).isEqualTo(true)
    }

    @Test
    fun case4() {
        assertThat(app.isMatch("abc", "a***abc")).isEqualTo(true)
    }
}