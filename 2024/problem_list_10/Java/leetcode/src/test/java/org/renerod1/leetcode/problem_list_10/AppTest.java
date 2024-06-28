package org.renerod1.leetcode.problem_list_10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void case1() {
        assertEquals(false, app.isMatch("aa", "a"));
    }

    @Test
    public void case2() {
        assertEquals(true, app.isMatch("aa", "a*"));
    }

    @Test
    public void case3() {
        assertEquals(true, app.isMatch("ab", ".*"));
    }

    @Test
    public void case4() {
        assertEquals(true, app.isMatch("abc", "a***abc"));
    }
}