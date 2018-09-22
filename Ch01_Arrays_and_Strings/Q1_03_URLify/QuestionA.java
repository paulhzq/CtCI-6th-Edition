class QuestionA {
    /*
    Question 1.3 URLify: write a method to replace all spaces in a string with '%20'. You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the 'true' length of the
    string. (Note: If implementing in Java, please
     */


    // When dealing with string manipulation, we often want to edit from end to start(backwards).
    public static void replaceSpace(char[] str, int trueLen) {
        int spaceCount = 0;
        for(int i=0;i<trueLen;i++) {
            if(str[i] == ' ') spaceCount++;
        }
        int index = trueLen + 2 * spaceCount;
        for(int j= trueLen-1;j>=0;j--) {
            if(str[j] == ' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
            } else {
                str[index-1] = str[j];
                index--;
            }
        }
    }
}