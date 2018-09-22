class QuestionB {

    // Create an array operating like a hash table. Mapping each character and frequency in the array.
    public static boolean checkPermutation(String A, String B) {
        if(A.length() != B.length()) return false;
        int[] letters = new int[128];
        for(int i=0;i<A.length();i++) {
            letters[A.charAt(i)]++;
        }
        for(int j=0;j<B.length();j++) {
            letters[B.charAt(j)]--;
            if(letters[B.charAt(j)]<0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String A = "abcdefgA";
        String B = "gfedcbaA";
        System.out.println(checkPermutation(A,B));
    }
}