package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is null");
        }
        if (!input.codePoints().allMatch(c -> c < 128)) {
            throw new IllegalArgumentException("Input contains non ASCII symbol");
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z') {
                set.add(currentChar);
            }
        }
        return set.size() == 26;
    }

}
