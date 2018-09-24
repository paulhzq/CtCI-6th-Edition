class QuestionA {
    /*
    Question 1.5 One Away: There are three types of edits that can be performed on strings: insert a character, remove
    a character, or replace a character. Given two strings, write a function to check if they are one edit(or zero
    edits) away.
     */

    // insert or remove should be the same function.
    public static boolean insert(String s, String t) {
        int index1 =0;
        int index2 = 0;
        while(index1<s.length() && index2<t.length()) {
           if(s.charAt(index1) != t.charAt(index2)) {
               if(index1!=index2) return false;
               index2++;
           } else {
               index1++;
               index2++;
           }
        }
        return true;
    }
    // replace a character.
    public static boolean replace(String s, String t) {
        int index1 =0;
        int index2 =0;
        boolean found = false;
        while(index1<s.length() && index2<t.length()) {
            if(s.charAt(index1) != t.charAt(index2)) {
                if (found) return false;
                found = true;
            }
            index1++;
            index2++;
        }
        return true;
    }

    public static boolean oneEdit(String s, String t) {
        if(s.length() == t.length()) {
            return replace(s,t);
        } else if(s.length() + 1 == t.length()) {
            return insert(s,t);
        } else if(t.length() + 1 == s.length()) {
            return insert(t,s);
        }
        return false;
    }

    public static void main(String[] args) {
        String[] a = new String[]{"pale", "pales","pale","pale"};
        String[] b = new String[]{"ple","pale","bale","bae"};
        for(int i= 0; i<4;i++) {
            System.out.println(oneEdit(a[i],b[i]));
        }
    }
}