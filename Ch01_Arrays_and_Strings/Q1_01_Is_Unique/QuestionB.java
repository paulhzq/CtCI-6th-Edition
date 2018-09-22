class QuestionB {
    /*
    we can reduce the space usage by a factor of 8 by using bit vector.And assuming the string only uses lowercase
    letter, we we only use just a single int checker. but a int has 32 bit.
     */
    public static boolean isUnqiueChars(String s) {
        int checker = 0;
        for(int i = 0; i<s.length();i++) {
            int val = s.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
}

/*
 Follow-up:
 1. compare every character of the string with every other character of the sting. Time O(N^2), Space(1)
 2. we sort the string and check the string for neighboring characters so time O (N logN), Space(1)(some sort take extra space.)
 */