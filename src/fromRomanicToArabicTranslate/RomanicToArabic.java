package fromRomanicToArabicTranslate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

public class RomanicToArabic {
    // TODO: 26.09.2022 Перевести римское число в десятичное, римское задано String
    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>(
                Map.of(
                        'M', 1000,
                        'D', 500,
                        'C', 100,
                        'L', 50,
                        'X', 10,
                        'V', 5,
                        'I', 1
                )
        );

        char[] charS = s.toCharArray();
        if (charS.length == 1) {
            return roman.get(charS[0]);
        }

        int result = roman.get(charS[charS.length - 1]);
        int a = 0;
        int b = 0;
        for (int pos = charS.length - 2; pos >= 0; pos--) {
            a = roman.get(charS[pos + 1]);
            b = roman.get(charS[pos]);
            if (a > b) {
                result -= b;
            } else {
                result += b;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //String str = "CMXCIV";
        String str = "MDCCCXXXIII";
        //String str = "MMCDLXXII";

        System.out.printf("Исходное число: %s, число десятичное: %d", str, romanToInt(str));
    }
}
