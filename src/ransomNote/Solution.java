package ransomNote;

// TODO: 26.09.2022 Проверить, что из букв строки magazine можно собрать строку ransomNoteMap.
//  Буквы могут быть использованы только один раз. Решение через словарь.

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canConstruct("aabbxc", "abxxcsba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = getMapFromString(ransomNote);
        Map<Character, Integer> magazineMap = getMapFromString(magazine);
        boolean canBuild = true;
        for (char ch : ransomNoteMap.keySet()) {
            if (!magazineMap.containsKey(ch) || ransomNoteMap.get(ch) > magazineMap.get(ch)) {
                canBuild = false;
                break;
            }
        }
        return canBuild;
    }

    private static Map<Character, Integer> getMapFromString(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> symbols = new HashMap<>();
        for (char ch : chars) {
            if (!symbols.containsKey(ch)) {
                symbols.put(ch, 0);
            }
            symbols.merge(ch, 1, Integer::sum);
        }
        return symbols;
    }
}
