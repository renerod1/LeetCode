package org.renerod1.leetcode.problem_list_9;

class App {
    public static void main(String[] args) {
        App app = new App();
        app.isPalindrome(121);
        app.isPalindrome(-121);
        app.isPalindrome(10);
    }

    public boolean isPalindrome(int x) {
        String stringX = String.valueOf(x);
        String reverseX = "";
        int i = 0;
        for (i = stringX.length() - 1; i >= 0; i--) {
            reverseX += stringX.charAt(i);
        }
        return stringX.equals(reverseX);
    }
}
