class QuestionA {
    /*
    Question 1.6 String Compression: Implement a method to perform basic string oompression using the counts of repeated
    characters. For example, the string aabccccaaa would become a2b1c5a3. If the "compressed" string would not become
    smaller than the original string. your method should return the original string. You can assume the string has only
    uppercase and lowercase letters(a-z).
     */

    // Time complexity O(n)
    public static String compress(String s) {
        String comp = "";
        int count = 0;
        for(int i=1;i<=s.length();i++) {
            count++;
            if( i==s.length() || s.charAt(i)!=s.charAt(i-1) ) {
                comp +="" + s.charAt(i-1) + count;
                count =0;
            }
        }
        return comp.length() < s.length() ? comp : s;
    }

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compress(s));

    }
}