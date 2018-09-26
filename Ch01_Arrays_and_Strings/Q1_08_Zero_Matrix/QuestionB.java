class QuestionB {

    // We can reduce the space to O(1) BY use first row as a replacement for rows and first  column as a replacement for
    // columns and use two flags to check if first row and first column contains zero or not.
    public static void zeroMatrix(int[][] matrix) {
        boolean rowHasZeros = false;
        boolean columnHasZeros = false;
        for(int j=0;j<matrix[0].length;j++) {
            if(matrix[0][j] == 0) {
                rowHasZeros = true;
                break;
            }
        }
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0] == 0) {
                columnHasZeros = true;
                break;
            }
        }

        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][j]==0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++) {
            if(matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j=1;j<matrix[0].length;j++) {
            if(matrix[0][j] == 0) {
                for(int i=0;i<matrix.length;i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowHasZeros) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[0][j] = 0;
            }
        }

        if(columnHasZeros) {
            for(int i=0;i<matrix.length;i++) {
                matrix[i][0] = 0;
            }
        }
    }
    
}