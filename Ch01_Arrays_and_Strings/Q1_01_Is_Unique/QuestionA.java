class QuestionA {
    /* Question 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters.
       What if you cannot use additional data structures?
    */


    // Ask the interviewer if the string is ASCII String or Unicode String.
    // Here we use ASCII string which is 128, but sometimes we may use 256 for the extend ASCII code, you need to
    // clarify in front of the interviewer.
    // And we create a boolean array, the index is the character corrpsond ascII code, the first time we come across
    // this character, we set that index of array to true, and if the second time we come across the same character,
    // we immediately return false without continue looping the string charArray.

    // Time capactiy O(n), n is the length of the string(or O(1) since we never loop over 128 characters.)
    // Space capacity O(1) since we only have a limit number of char in the ASCII code.
    public static boolean isUniqueChar(String s) {
        if(s.length()>128) return false;
        boolean[] Seen = new boolean[128];
        for(int i =0 ;i<s.length();i++) {
            int val = s.charAt(i);
            if(Seen[val]) return false;
            Seen[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String test = "abcdabadafs";
        String test1 = "abcdefg";
        System.out.println(isUniqueChar(test));
        System.out.println(isUniqueChar(test1));
    }
}