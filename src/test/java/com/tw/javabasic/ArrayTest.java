package com.tw.javabasic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayTest {
    @Test
    void should_resize_array() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = null;

        // TODO: Please allocate a new array whose length is 10 and copy the
        //   original array into the new array. You should not use `for` or
        //   other kind of loops explicitly.
        //
        // Hint:
        //  If you meet difficulties, please refer to "Core Java Vol 1", section 3.10.4.
        // <--start

        newArray = new int[10];
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

        // -end->

        assertArrayEquals(
            new int[] {1, 2, 3, 4, 5, 0, 0, 0, 0, 0},
            newArray
        );
    }

    @Test
    void should_slice_array() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] first2Elements = null;
        int[] last3Elements = null;

        // TODO: Please slice the original array into two array objects. You should
        //   not use `for` or other kind of loop explicitly.
        //
        // Hint:
        //  If you meet difficulties, please refer to https://www.baeldung.com/java-array-copy.
        // <--start

        int len = originalArray.length;
        first2Elements = Arrays.copyOfRange(originalArray, 0, len / 2);
        last3Elements = Arrays.copyOfRange(originalArray, len / 2, len);

        // -end->

        assertArrayEquals(new int[] {1, 2}, first2Elements);
        assertArrayEquals(new int[] {3, 4, 5}, last3Elements);
    }

    @Test
    void should_iterate_over_an_array() {
        int[] originalArray = {1, 2, 3, 4, 5};
        String destination = null;

        // TODO: Please iterate over an array and turn each element into its string
        //   representation. You should use loop to do iteration. You should not
        //   using Stream API.
        //
        // Hint:
        //  If you meet difficulties, please refer to https://www.baeldung.com/java-iterate-list.
        // <-start-

        StringBuilder builder = new StringBuilder();
        for(int num : originalArray)
            builder.append(num);
        destination = builder.toString();

        // --end->

        assertEquals("12345", destination);
    }

    @Test
    void should_reverse_an_array() {
        String[] originalArray = {"A", "quick", "brown", "fox"};
        String[] reversed = null;

        // TODO: Please reverse the array to a new one. You should not modify original
        //   array.
        //
        // Hint:
        //  If you meet difficulties, please refer to https://www.baeldung.com/java-invert-array.
        // <--start-

        // --end->

        assertArrayEquals(new String[] {"fox", "brown", "quick", "A"}, reversed);
        assertArrayEquals(new String[] {"A", "quick", "brown", "fox"}, originalArray);
    }
}
