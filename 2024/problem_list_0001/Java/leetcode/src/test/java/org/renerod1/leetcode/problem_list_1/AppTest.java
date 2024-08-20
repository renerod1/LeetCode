package org.renerod1.leetcode.problem_list_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void case1() {
        int[] input = app.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        int[] output = new int[] { 0, 1 };  
        // System.out.println(input[0] + "," + input[1]);
        assertEquals(input[0], output[0]);
        assertEquals(input[1], output[1]);
    }

    @Test
    public void case2() {
        int[] input = app.twoSum(new int[] { 3, 2, 4 }, 6);
        int[] output = new int[] { 1, 2 };  
        // System.out.println(input[0] + "," + input[1]);
        assertEquals(input[0], output[0]);
        assertEquals(input[1], output[1]);
    }

    @Test
    public void case3() {
        int[] input = app.twoSum(new int[] { 3, 3 }, 6);
        int[] output = new int[] { 0, 1 };  
        // System.out.println(input[0] + "," + input[1]);
        assertEquals(input[0], output[0]);
        assertEquals(input[1], output[1]);
    }
}