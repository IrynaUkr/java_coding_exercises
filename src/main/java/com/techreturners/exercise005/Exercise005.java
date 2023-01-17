package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;

public class Exercise005 {

    public static final int ALPHABET_LETTER_COUNT  = 26;
    public static final int ASCII_SYMBOLS_AMOUNT = 128;

    public boolean isPangram(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is null");
        }
        if (!input.codePoints().allMatch(c -> c < ASCII_SYMBOLS_AMOUNT)) {
            throw new IllegalArgumentException("Input contains non ASCII symbol");
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z') {
                set.add(currentChar);
            }
        }
        return set.size() == ALPHABET_LETTER_COUNT ;
    }

}
