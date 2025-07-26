package org.renerod1.leetcode.problem_list_0704;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    App app = new App();

    @Test
    public void case1() {
        int expected = app.search(new int[] { -1,0,3,5,9,12 }, 9);
        assertEquals(expected, 4);

    }

    @Test
    public void case2() {
        int expected = app.search(new int[] { -1,0,3,5,9,12 }, 2);
        assertEquals(expected, -1);
    }
}