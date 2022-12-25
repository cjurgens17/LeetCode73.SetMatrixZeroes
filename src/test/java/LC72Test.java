import static org.junit.Assert.*;

public class LC72Test {

    @org.junit.Test
    public void setMatrixZeroes() {

        int[][] expected1 = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        int[][] expected2 = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        int[][] expected3 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 0, 0}, {0, 0, 0, 3}, {0, 0, 0, 0}};

        int[][] actual1 = LC72.setMatrixZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        int[][] actual2 = LC72.setMatrixZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
        int[][] actual3 = LC72.setMatrixZeroes(new int[][]{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}});

        assertArrayEquals(expected1,actual1);
        assertArrayEquals(expected2,actual2);
        assertArrayEquals(expected3,actual3);


    }
}