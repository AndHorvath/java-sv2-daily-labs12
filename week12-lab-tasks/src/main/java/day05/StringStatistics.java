package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {

    public Map<Character, Integer> createStringStatistics(String text) {
        Map<Character, Integer> stringStatistics = new HashMap<>();
        for (char character : text.toLowerCase().toCharArray()) {
            if (!stringStatistics.containsKey(character)) {
                stringStatistics.put(character, 0);
            }
            stringStatistics.put(character, stringStatistics.get(character) + 1);
        }
        return stringStatistics;
    }
}