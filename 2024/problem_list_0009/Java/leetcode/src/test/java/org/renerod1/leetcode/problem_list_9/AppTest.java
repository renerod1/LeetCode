package org.renerod1.leetcode.problem_list_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    App app = new App();

    @Test
    public void case1() {
        assertEquals(true, app.isPalindrome(121));
    }

    @Test
    public void case2() {
        assertEquals(false, app.isPalindrome(-121));
    }

    @Test
    public void case3() {
        assertEquals(false, app.isPalindrome(10));
    }
}