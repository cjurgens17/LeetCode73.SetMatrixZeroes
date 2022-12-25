import java.util.Arrays;

public class LC72 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setMatrixZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})));
        System.out.println(Arrays.deepToString(setMatrixZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}})));
        System.out.println(Arrays.deepToString(setMatrixZeroes(new int[][]{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}})));

    }

    //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    //
    //You must do it in place.
    //
    //
    //
    //Example 1:
    //
    //
    //Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    //Output: [[1,0,1],[0,0,0],[1,0,1]]
    //Example 2:
    //
    //
    //Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    //Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
    //
    //
    //Constraints:
    //
    //m == matrix.length
    //n == matrix[0].length
    //1 <= m, n <= 200
    //-231 <= matrix[i][j] <= 231 - 1

    public static int[][] setMatrixZeroes(int[][] matrix){
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0 && !visited[i][j]){
                    helper(matrix, i, j, visited);
                }
            }
        }
        return matrix;
    }

    public static void helper(int[][] matrix, int row, int col, boolean[][] visited){
        for(int i = 0;i<matrix[row].length;i++){
            if(matrix[row][i] != 0){
                visited[row][i] = true;
            }
            matrix[row][i] = 0;
        }

        for(int i = 0;i<matrix.length;i++){
            if(matrix[i][col] != 0){
                visited[i][col] = true;
            }
            matrix[i][col] = 0;
        }
    }

}
