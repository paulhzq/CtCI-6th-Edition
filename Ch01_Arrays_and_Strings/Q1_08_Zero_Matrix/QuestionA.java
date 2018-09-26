class QuestionA {
    /*
    Question 1.8 Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
    column are set to 0.
     */

    // we can have a second matrix to flag the zero locations. but it will take space(mn), a waste of space.

    // How about use two array to keep track of all the rows with zeros and all the columns with zeros.
    // Time O(mn), space O(n)
    public static void zeroMatrix(int[][] matrix) {
         boolean[] rows = new boolean[matrix.length];
         boolean[] columns = new boolean[matrix[0].length];
         for(int i=0;i<matrix.length;i++) {
             for(int j=0;j<matrix[0].length;j++) {
                 if(matrix[i][j]==0) {
                     rows[i] = true;
                     columns[j] = true;
                 }
             }
        }

        for(int i=0;i<matrix.length;i++) {
             if(rows[i]) {
                 for (int j = 0; j < matrix[0].length; j++) {
                     matrix[i][j] = 0;
                 }
             }
        }

        for(int j=0;j<matrix[0].length;j++) {
             if(columns[j]) {
                 for(int i=0;i<matrix.length;i++) {
                     matrix[i][j] = 0;
                 }
             }
        }
    }
}