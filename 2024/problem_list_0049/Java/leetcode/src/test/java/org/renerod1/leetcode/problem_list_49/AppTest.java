package org.renerod1.leetcode.problem_list_49;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
    
public class AppTest {

    @Test
    public void case1() {
        App app = new App();
        List<List<String>> expected = Arrays.asList(Arrays.asList("eat","tea","ate"), Arrays.asList("bat"), Arrays.asList("tan","nat"));
        assertEquals(expected, app.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    @Test
    public void case2() {
        App app = new App();
        List<List<String>> expected = Arrays.asList(Arrays.asList(""));
        assertEquals(expected, app.groupAnagrams(new String[]{""}));
    }

    @Test
    public void case3() {
        App app = new App();
        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));
        assertEquals(expected, app.groupAnagrams(new String[]{"a"}));
    }
}
    