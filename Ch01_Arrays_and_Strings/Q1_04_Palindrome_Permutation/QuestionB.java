class QuestionB {

    // we can optimize by one loop.
    public static boolean isPermutationOfPalindrome(String s) {
        String phrase = s.replaceAll("\\s","").toLowerCase();
        int[] table = new int[26];
        int countOdd = 0;
        for(int i = 0;i<phrase.length();i++) {
            table[phrase.charAt(i)-'a']++;
            if(table[phrase.charAt(i)-'a']%2 == 1) {
                countOdd++;
            } else {
                countOdd--;
            }
        }
        return countOdd<=1;
    }

    public static void main(String[] args) {
            String s = "abc  cba";
            System.out.println(isPermutationOfPalindrome(s));
    }
}