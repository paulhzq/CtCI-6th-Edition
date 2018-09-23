class QuestionC {
    // we can use bitvector to toggle the bit and in the end check that at most one bit in the integer is set to 1.
    public static boolean isPermutationOfPalindrome(String s) {
        String phrase = s.replaceAll("\\s","").toLowerCase();
        int bitVector = 0;
        for(int i = 0;i<phrase.length();i++) {
            int mask = 1;
            int index = phrase.charAt(i)-'a';
            if((bitVector & (mask << index)) == 0) {
                bitVector |= mask; // set the index-th bit to 1 in bitVector since in bitVector the index-th bit is 0.
            } else {
                bitVector &= ~mask; // reset the index-th bit to 0 in bitVector since in bitVector the index-th bit is 1
            }
        }
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);// bitVector == 0 mean no bit in bitVector is 1.
    }

    // check bitVector has exactly one bit set to 1.
    public static boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector-1)) == 0;
    }

    // Another bitwise method to toggle the bit.
    public static boolean isPermutationOfPalindrome2(String s) {
        String phrase = s.replaceAll("\\s","").toLowerCase();
        int bitVector = 0;
        for(int i = 0;i<phrase.length();i++) {
            int mask = 1;
            int index = phrase.charAt(i)-'a';
            mask <<=index;
            bitVector ^= mask; // (A^B)^B = A
        }
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);// bitVector == 0 mean no bit in bitVector is 1.
    }

    public static void main(String[] args) {
        String s = "abc  cba";
        System.out.println(isPermutationOfPalindrome(s));
        System.out.println(isPermutationOfPalindrome2(s));
    }
}