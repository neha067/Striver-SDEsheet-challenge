import java.util.*;

class Solution {
    public static void main(String[] args) {
        String s1 = "", s2 = "", s3 = "a";

        int i = 0, j = 0, k = 0;
        char c3;
        while (k < s3.length()) {
            c3 = s3.charAt(k);
            while (i < s1.length() && k < s3.length() - 1 && c3 == s1.charAt(i)) {
                c3 = s3.charAt(++k);
                i++;
            }
            while (j < s2.length() && k < s3.length() - 1 && c3 == s2.charAt(j)) {
                c3 = s3.charAt(++k);
                j++;
            }
            if (c3 != s1.charAt(i) && c3 != s2.charAt(j))
                System.out.println("false");
        }

        System.out.println("true");
    }
}