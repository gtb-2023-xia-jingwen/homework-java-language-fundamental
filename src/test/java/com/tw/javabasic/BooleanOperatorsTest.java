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
}
