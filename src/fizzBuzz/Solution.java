package fizzBuzz;

// TODO: 26.09.2022 Дано число n. Пройти по всем числам от 1 до n. В список вывести само число,
//  если оно не делится на 5 или 3. Fizz - если делится на 5, Buzz - если делится на 3.
//  И FizzBuzz если делится на 3 и 5.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(7));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
