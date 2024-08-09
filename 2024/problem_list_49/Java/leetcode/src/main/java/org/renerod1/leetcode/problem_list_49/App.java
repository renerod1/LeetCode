package org.renerod1.leetcode.problem_list_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class App {
    public static void main(String[] args) {
        App app = new App();
        String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        app.groupAnagrams(strs1);
        String[] strs2 = { "" };
        app.groupAnagrams(strs2);
        String[] strs3 = { "a" };
        app.groupAnagrams(strs3);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int i = 0;
        
        Map<String, List<String>> list = new HashMap<>();

        for (i = 0; i < strs.length; i++) {
            char tempChars[] = strs[i].toCharArray();
            Arrays.sort(tempChars);
            System.out.println(tempChars);
            String sortedChars = new String(tempChars);

            if (!list.containsKey(sortedChars)) {
                list.put(sortedChars, new ArrayList<>());
            }
            list.get(sortedChars).add(strs[i]);
        }
        return new ArrayList<>(list.values());
    }
}
