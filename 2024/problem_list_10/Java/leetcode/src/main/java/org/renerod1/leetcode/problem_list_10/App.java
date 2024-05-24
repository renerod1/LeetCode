package org.renerod1.leetcode.problem_list_10;

class App {
    public static void main(String[] args) {
        App s = new App();
        s.isMatch("aa", "a");
        s.isMatch("aa", "a*");
        s.isMatch("ab", ".*");
        s.isMatch("abc", "a***abc");
    }

    public boolean isMatch(String s, String p) {
        while (p.contains("**")) {
            p = p.replace("**", "*");
        }
        return s.matches(p);
    }
}
