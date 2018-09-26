class QuestionB {
    public static void rotate(int[][] matrix) {
        //transpoe
        for(int i =0;i<matrix.length;i++) {
            for(int j = i; j<matrix.length;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //flip
        for(int i =0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}