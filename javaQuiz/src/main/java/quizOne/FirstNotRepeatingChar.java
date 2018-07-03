package quizOne;

import java.util.LinkedHashMap;
import java.util.Map;

class FirstNotRepeatingChar {
    char getFirstUniqueChar(String s) {
        char[] chars = s.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (char c : chars) {
            if (!linkedHashMap.containsKey(c)) {
                linkedHashMap.put(c, 1);
            } else {
                linkedHashMap.put(c, linkedHashMap.get(c) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
