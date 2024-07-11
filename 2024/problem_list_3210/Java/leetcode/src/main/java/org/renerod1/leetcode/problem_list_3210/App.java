package org.renerod1.leetcode.problem_list_3210;

class App {
    public static void main(String[] args) {
        App app = new App();
        app.getEncryptedString("dart", 3);
        app.getEncryptedString("aaa", 1);
        app.getEncryptedString("byd", 4);
    }

    public String getEncryptedString(String s, int k) {
        int strLength = s.length();
        while (strLength < k) {
            k -= strLength;
        }
        String subString1 = s.substring(k);
        String subString2 = s.substring(0, k);
        return subString1 + subString2;
    }
}
