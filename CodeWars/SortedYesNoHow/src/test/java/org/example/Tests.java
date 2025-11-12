package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

class Tests {
    @Test
    public void sampleTests() {
        doTest(new int[]{1, 3, 9, 4}, "no");
        doTest(new int[]{4, 3, 1, 9}, "no");
        doTest(new int[]{1, 2}, "yes, ascending");
        doTest(new int[]{2, 1}, "yes, descending");
        doTest(new int[]{1, 2, 3, 4}, "yes, ascending");
        doTest(new int[]{1, 1, 2, 3}, "yes, ascending");
        doTest(new int[]{1, 2, 3, 3}, "yes, ascending");
        doTest(new int[]{4, 3, 2, 1}, "yes, descending");
        doTest(new int[]{3, 3, 2, 1}, "yes, descending");
        doTest(new int[]{3, 2, 1, 1}, "yes, descending");
    }

    private static void doTest(int[] input, String expected) {
        String message = String.format("for array = %s\n", Arrays.toString(input));
        String actual = Solution.isSortedAndHow(input);
        assertEquals(expected, actual, message);
    }
}