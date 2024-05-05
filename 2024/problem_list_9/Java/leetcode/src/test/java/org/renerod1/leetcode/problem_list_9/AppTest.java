package org.renerod1.leetcode.problem_list_9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    App s = new App();

    @Test
    public void case1() {
        assertEquals(true, s.isPalindrome(121));
    }

    @Test
    public void case2() {
        assertEquals(false, s.isPalindrome(-121));
    }

    @Test
    public void case3() {
        assertEquals(false, s.isPalindrome(10));
    }
}