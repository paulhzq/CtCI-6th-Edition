class QuestionA {
    /*
    Question 1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
    write a method to rotate the image by 90 degrees, Can you do this in place?
     */


    // One pass.
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0 ;i<n/2;i++) {
            for(int j =i;j<n-1-i;j++) {
                int temp = matrix[i][j]; // top
                matrix[i][j] = matrix[n-1-j][i]; // left-> top
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]; // bottom-> left
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i]; // right -> bottom
                matrix[j][n-1-i] = temp; // top-> right
            }
        }
    }
}