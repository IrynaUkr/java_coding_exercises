package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return (word.substring(0, 1)).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double addedVatPrice = originalPrice * (1 + vatRate / 100);
        return Math.round(addedVatPrice * 100) / 100.0d;
    }

    public String reverse(String sentence) {
        StringBuilder reversed = new StringBuilder();
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed.append(sentence.charAt(i));
        }
        return reversed.toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int) users.stream().filter(user -> user.getType().equals("Linux")).count();
    }

}
