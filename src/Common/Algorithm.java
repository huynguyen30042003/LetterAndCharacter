package Common;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {
    public void letterCount(String string) {
        String Str = string.replaceAll("\\s+", " ");
        String[] arr = Str.split(" ");
        int[] count = new int[arr.length];
        Map<String, Integer> letterCountMap = new HashMap<>();
        for (String letter : arr) {
            if (letterCountMap.containsKey(letter)) {
                letterCountMap.put(letter, letterCountMap.get(letter) + 1);
            } else {
                letterCountMap.put(letter, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : letterCountMap.entrySet()) {
            System.out.print(entry.getKey() + "= " + entry.getValue() + " , ");
        }

    }

    public void characterCount(String str) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.print(entry.getKey() + "= " + entry.getValue() + " , ");
        }
    }

}
