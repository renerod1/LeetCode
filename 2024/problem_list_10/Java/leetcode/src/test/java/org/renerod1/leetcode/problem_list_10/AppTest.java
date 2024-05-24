package org.renerod1.leetcode.problem_list_10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    App s = new App();

    @Test
    public void case1() {
        assertEquals(false, s.isMatch("aa", "a"));
    }

    @Test
    public void case2() {
        assertEquals(true, s.isMatch("aa", "a*"));
    }

    @Test
    public void case3() {
        assertEquals(true, s.isMatch("ab", ".*"));
    }

    @Test
    public void case4() {
        assertEquals(true, s.isMatch("abc", "a***abc"));
    }
}