class QuestionA {
    /*
    Question 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
     */

    // sort the string to check if there are the same string.
    public static boolean checkPermutation(String A, String B) {
        // String A and B need to have the same length to be permutation.
        if(A.length() != B.length()) return false;
        return sort(A).equals(sort(B));
    }
    public static String sort(String s) {
        char[] tmp = s.toCharArray();
        java.util.Arrays.sort(tmp);
        return new String(tmp);
    }

    public static void main(String[] args) {
        String A = "abcdefg";
        String B = "gfedcba";
        System.out.println(checkPermutation(A,B));
    }
}