package com.tw.javabasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tw.javabasic.util.ExamScore;
import org.junit.jupiter.api.Test;


class BooleanOperatorsTest {
    // Recommended time used: 8 min

    boolean isSuccess(ExamScore score) {
        // TODO: Please complete the function `isSuccess` to determine if the exam is
        //   failed or not.
        //   The exam will be a failure when either of the following is true.
        //   (1) At least 2 scores (test cases, requirement, code format, code details)
        //       are less than 0.
        //   (2) The final score is less than 0.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 62 of "Core Java Vol 1", section 3.5.6
        //  and 3.5.7.
        // <-start-
        throw new RuntimeException();
        // --end->
    }

    @Test
    void should_determine_failure() {
        assertTrue(isSuccess(new ExamScore(1, 1, 1, 1)));
        assertTrue(isSuccess(new ExamScore(-1, 1, 1, 1)));
        assertTrue(isSuccess(new ExamScore(0, 0, 0, 0)));
        assertTrue(isSuccess(new ExamScore(-1, 1, 0, 0)));
        assertTrue(isSuccess(new ExamScore(0, 1, -1, 0)));
        assertTrue(isSuccess(new ExamScore(0, 1, 0, -1)));
        assertFalse(isSuccess(new ExamScore(2, 2, -1, -1)));
        assertFalse(isSuccess(new ExamScore(2, -1, 2, -1)));
        assertFalse(isSuccess(new ExamScore(-1, 2, -1, 2)));
        assertFalse(isSuccess(new ExamScore(-1, 0, 0, 0)));
        assertFalse(isSuccess(new ExamScore(-1, -1, -1, -1)));
    }

    @SuppressWarnings({"UnnecessaryLocalVariable", "ConstantConditions", "SimplifiableJUnitAssertion"})
    @Test
    void should_do_flag_operations() {
        // TODO:
        //  Please determine the values of each flag.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 62 of "Core Java Vol 1", section 3.5.6
        //  and 3.5.7.
        // <--start
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        // --end-->

        int theNorth = north;
        int theSouthEast = south | east;
        int theNorthWest = north | west;
        int all = north | south | east | west;

        assertTrue(north != 0 && south != 0 && east != 0 && west != 0);
        assertTrue(north != south && north != east && north != west && south != east && south != west && east != west);
        assertEquals(north, north & theNorth);
        assertEquals(north, north & theNorthWest);
        assertEquals(north, north & all);
        assertEquals(south, south & all);
        assertEquals(east, east & all);
        assertEquals(west, west & all);
        assertEquals(theNorthWest, theNorthWest & all);
        assertEquals(0, north & theSouthEast);
        assertEquals(0, north & south);
        assertEquals(0, north & east);
        assertEquals(0, north & west);
    }

    @Test
    void should_create_a_mask_to_get_the_selected_bit() {
        // TODO:
        //  please write your answers directly. Please note that you should keep you answer in
        //  HEX mode.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 62 of "Core Java Vol 1", section 3.5.6
        //  and 3.5.7.
        // <--start
        final int mask = 0;
        // --end-->

        assertEquals(0x0204_0608, 0x1234_5678 & mask);
        assertEquals(0x0b0d_0f02, 0xabcd_ef12 & mask);
    }
}
