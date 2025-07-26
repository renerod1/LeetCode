package org.renerod1.leetcode.problem_list_0704;

import java.util.Arrays;
import java.util.List;

class App {
    public static void main(String[] args) {
        App app = new App();
        app.search(new int[] {-1,0,3,5,9,12}, 9);
        app.search(new int[] {-1,0,3,5,9,12}, 2);
    }

    public int search(int[] nums, int target) {
        List<Integer> a = Arrays.stream(nums).boxed().toList();

        return a.indexOf(target);
    }
}
