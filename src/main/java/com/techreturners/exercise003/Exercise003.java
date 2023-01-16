package com.techreturners.exercise003;

public class Exercise003 {

    private static final String[] iceCreamFlavourStorage = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};


    int getIceCreamCode(String iceCreamFlavour) {
        if (iceCreamFlavour.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < iceCreamFlavourStorage.length; i++) {
            if (iceCreamFlavour.equals(iceCreamFlavourStorage[i])) {
                return i;
            }
        }
        return -1;
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavourStorage;
    }

}
