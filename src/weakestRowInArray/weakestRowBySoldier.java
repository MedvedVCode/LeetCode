package weakestRowInArray;

import java.util.*;
import java.util.stream.Stream;

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
        System.out.println(Arrays.toString(result));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, List<Integer>> resultMap = new TreeMap<>();

        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (!resultMap.containsKey(sum)) {
                resultMap.put(sum, new ArrayList<>());
            }
            resultMap.get(sum).add(i);
            sum = 0;
        }

        int pos = 0;
        int[] result = new int[k];
        for (int key : resultMap.keySet()) {
            if (pos == k) break;
            List<Integer> list = resultMap.get(key);
            for (int value : list) {
                if (pos == k) break;
                result[pos] = value;
                pos++;
            }
        }
        return result;
    }
}
