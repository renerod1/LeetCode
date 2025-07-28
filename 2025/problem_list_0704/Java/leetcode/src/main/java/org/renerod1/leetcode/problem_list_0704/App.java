package org.renerod1.leetcode.problem_list_0704;

class App {
    public static void main(String[] args) {
        App app = new App();
        app.search(new int[] {-1,0,3,5,9,12}, 9);
        app.search(new int[] {-1,0,3,5,9,12}, 2);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
