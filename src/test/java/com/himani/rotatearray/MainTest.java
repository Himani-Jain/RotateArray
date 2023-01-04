package com.himani.rotatearray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    @DisplayName("Test Case 1: Rotate as expected")
    void workingTestCase1() throws Exception {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int pos = 2;
        int[] expected = new int[]{3,4,5,6,7,1,2};
        int[] actual = main.rotateArray(arr,pos);
        assertTrue(Arrays.equals(actual, expected));
    }

    @Test
    @DisplayName("Test Case 2: Rotate as expected")
    void workingTestCase2() throws Exception {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int pos = 8;
        int[] expected = new int[]{2,3,4,5,6,7,1};
        int[] actual = main.rotateArray(arr,pos);
        assertTrue(Arrays.equals(actual, expected));
    }

    @Test
    @DisplayName("Test Case 3: Handles negative rotate value")
    void negativeNumber() throws Exception {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int pos = -1;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            main.rotateArray(arr,pos);
        });

        String expectedMessage = "Rotate Positions cannot be negative!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}