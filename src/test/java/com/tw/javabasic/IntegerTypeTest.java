package com.tw.javabasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class IntegerTypeTest {
    // Recommended time used: 25 min
    @Test
    void should_overflow_silently() {
        int theNumberWillOverflow = Integer.MAX_VALUE;
        ++theNumberWillOverflow;

        // TODO:
        //  Please correct the value to pass the test. You should write the result directly.
        //
        // Hint:
        //  If you find it difficult, please check "Core Java Vol 1", section 3.3.1
        // <--start
        final int expectedResult = Integer.MIN_VALUE;
        // --end-->

        assertEquals(expectedResult, theNumberWillOverflow);
    }

    @Test
    void should_underflow_silently() {
        int theNumberWillUnderflow = Integer.MIN_VALUE;
        --theNumberWillUnderflow;

        // TODO:
        //  Please correct the value to pass the test. You should write the result directly.
        // <--start
        final int expectedResult = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expectedResult, theNumberWillUnderflow);
    }

    @Test
    void should_throw_exception_when_overflow() {
        int theNumberWillOverflow = Integer.MAX_VALUE;

        // Hint: you need to implement add() method in this class.
        assertThrows(ArithmeticException.class, () -> add(theNumberWillOverflow, 1));
    }

    @Test
    void just_prevent_lazy_implementation() {
        // Hint: you need to implement add() method in this class.
        assertEquals(3, add(1, 2));
    }

    @SuppressWarnings("PointlessArithmeticExpression")
    @Test
    void should_take_care_of_number_type_when_doing_calculation() {
        final double result1 = 2 / 3 * 5;
        final double result2 = 2 * 5 / 3;

        // TODO:
        //  please modify the following lines to pass the test.
        //
        // Hint:
        //  If you want some reference please see page 59 of "Core Java Vol 1", section 3.5.2.
        // <!--start
        final double expectedResult1 = 0.0;
        final double expectedResult2 = 3.0;
        // --end-->

        assertEquals(expectedResult1, result1, +1.0E-05);
        assertEquals(expectedResult2, result2, +1.0E-05);
    }

    @Test
    void should_truncate_number_when_casting() {
        final int integer = 0x0123_4567;
        final short smallerInteger = (short)integer;

        // TODO:
        //  please modify the following lines to pass the test. Please refer to page 60 of "Core Java Vol 1", section 3.5.3.
        // <!--start
        final short expected = 0x4567;
        // --end-->

        assertEquals(expected, smallerInteger);
    }

    @Test
    void should_increment() {
        int integer = 3;

        int result = integer++;

        // TODO:
        //  please modify the following code to pass the test. You should write the
        //  result directly.
        // <--start
        final int expectedCurrentInteger = 4;
        final int expectedResult = 3;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    @Test
    void should_increment_2() {
        int integer = 3;

        int result = ++integer;

        // TODO:
        //   please modify the following code to pass the test. You should write the
        //   result directly.
        // <--start
        final int expectedCurrentInteger = 4;
        final int expectedResult = 4;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    private int add(int left, int right) {
        // TODO:
        //  Please implement the method. Adding two numbers. This method should throw
        //  ArithmeticException if overflow or underflow happens.
        //
        // Hint
        //  Java library contains method to do this. If you meet some difficulties
        //  here please refer to the following document:
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#addExact-int-int-
        // <--start
        int res = left + right;
        if ((left > 0 && right > 0 && res < 0) || (left < 0 && right < 0 &&  res > 0)) {
            throw new ArithmeticException();
        }
        return res;
        // --end-->
    }
}
