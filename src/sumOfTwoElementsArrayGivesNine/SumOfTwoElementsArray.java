package sumOfTwoElementsArrayGivesNine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TODO: 29.09.2022 Выдать номера в массиве из двух элементов, сумма которых состовляет 9
public class SumOfTwoElementsArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 5, 4, -2};
        System.out.println(Arrays.toString(twoSum(array, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(nums[i])) {
                array[0] = result.get(nums[i]);
                array[1] = i;
                break;
            }
            if (!result.containsKey(target - nums[i])) {
                result.put(target - nums[i], i);
            }
        }
        return array;
    }
}
