package org.renerod1.leetcode.problem_list_3210;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void case1() {
        assertEquals("tdar", app.getEncryptedString("dart", 3));
    }

    @Test
    public void case2() {
        assertEquals("aaa", app.getEncryptedString("aaa", 1));
    }

    @Test
    public void case3() {
        assertEquals("ydb", app.getEncryptedString("byd", 4));
    }
}