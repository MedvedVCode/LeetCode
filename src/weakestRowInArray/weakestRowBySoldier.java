package weakestRowInArray;

import java.util.Arrays;

public class weakestRowBySoldier {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int[] result = kWeakestRows(mat, 3);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int sum = 0;
        int[] result = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            result[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.printf("Номер %d, скилько солдат %d\n", i, result[i]);
        }
        return result;
    }
}
