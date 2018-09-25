class QuestionB {
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=1;i<=s.length();i++) {
            count++;
            if( i==s.length() || s.charAt(i)!=s.charAt(i-1) ) {
                sb.append(s.charAt(i-1));
                sb.append(count);
                count =0;
            }
        }
        return sb.length() < s.length() ? new String(sb) : s;
    }

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compress(s));
    }
}