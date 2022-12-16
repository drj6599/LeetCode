public class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {

        int r = 0;
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0)
                {
                    r = i;
                    c = j;
                    for (int col = 0; col < matrix[i].length; col++) {
                        matrix[r][col] = 0;
                    }

                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][c] = 0;
                    }
                    break;
                }


            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }

}
