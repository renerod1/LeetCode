package org.renerod1.leetcode.problem_list_1;

class App {
    public static void main(String[] args) {
        App s = new App();
        s.twoSum(new int[] {2,7,11,15}, 9);
        s.twoSum(new int[] {3,2,4}, 6);
        s.twoSum(new int[] {3,3}, 6);
    }

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int[] ans;
        boolean found = false;
        ans = new int[2];
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    ans[0] = i;
                    ans[1] = j;
                    found = true;
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return ans;
    }
}
