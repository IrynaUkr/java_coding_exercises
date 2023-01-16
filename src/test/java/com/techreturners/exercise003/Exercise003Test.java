package com.techreturners.exercise003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise003Test {

    private Exercise003 ex003;

    @BeforeEach
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    void checkPickMultipleIceCreamFlavours() {
        String[] expected = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }

    @Test
    void checkThrowIllegalArgumentExceptionIfStringIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> ex003.getIceCreamCode(""));
    }

    @Test
    void checkReturnMinusOneIfFlavoursDoesNotPresentTest() {
        int actual = ex003.getIceCreamCode("Does not exist");
        int expected = -1;
        assertEquals(expected, actual);
    }

}
