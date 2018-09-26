class QuestionA {
    /*
    Question 1.9 String Rotation: Assume you have a method isSubstring which checks if one word is a substring of
    another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to
    isSubstring(eg: "waterbootle" is a rotation of "erbottlewat")
     */


    // suppose s1 = xy,s2= yx, so yx will always be a substring of xyxy.
    // time O(n)
    public static boolean rotateString(String s1, String s2) {
        int len = s1.length();
        if(len == s2.length() && len>0) {
            String s1s1 = s1 + s1;
            return isSubstring(s1s1,s2);
        }
        return false;
    }

    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}