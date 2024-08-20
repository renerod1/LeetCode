package org.renerod1.leetcode.problem_list_10;

class App {
    public static void main(String[] args) {
        App app = new App();
        app.isMatch("aa", "a");
        app.isMatch("aa", "a*");
        app.isMatch("ab", ".*");
        app.isMatch("abc", "a***abc");
    }

    public boolean isMatch(String s, String p) {
        while (p.contains("**")) {
            p = p.replace("**", "*");
        }
        return s.matches(p);
    }
}
