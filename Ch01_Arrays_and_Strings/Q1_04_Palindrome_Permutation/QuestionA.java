class QuestionA {
    /*
    Question 1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a
    palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a
    rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
     */

    // use a table to count how many times each character appears. And make sure no more than one character has odd
    // count.
    public static boolean isPermutationOfPalindrome(String s) {
        String phrase = s.replaceAll("\\s","").toLowerCase();
        int[] table = buildCharFrequencyTable(phrase);
        boolean foundOdd = false;
        for(int count: table) {
            if(count%2==1) {
                if(foundOdd) return false;
                foundOdd = true;
            }
        }
        return true;
    }
    public static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[26];
        for(int i = 0;i<phrase.length();i++) {
            table[phrase.charAt(i)-'a']++;
        }
        return table;
    }

    public static void main(String[] args) {
        String s = "abc  cba";
        System.out.println(isPermutationOfPalindrome(s));
    }
}