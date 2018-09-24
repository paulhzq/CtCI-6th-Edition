class QuestionB {

    // Combine two method together.
    public static boolean oneEdit(String s, String t) {
        int index1 =0;
        int index2 =0;
        String s1 = s.length() < t.length() ? s : t;
        String s2 = s.length() < t.length() ? t: s;
        boolean found = false;
        while(index1<s1.length() && index2<s2.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if(found) return false;
                found = true;
                if(s1.length() == s2.length()) index1++; // replace
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = new String[]{"pale", "pales","pale","pale"};
        String[] b = new String[]{"ple","pale","bale","bae"};
        for(int i= 0; i<4;i++) {
            System.out.println(oneEdit(a[i],b[i]));
        }
    }
}