package com.tw.javabasic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class StringTest {
    // Recommended time used: 45 min

    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void should_be_immutable() {
        String originalString = "The original string";
        String modifiedString = originalString.replace("original", "new");

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        final boolean areSame = false;
        // Reason: the original string dose not change
        // --end-->

        assertEquals("The new string", modifiedString);
        assertEquals(areSame, originalString.equals(modifiedString));
    }

    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void all_modification_method_will_create_new_string() {
        String originalString = "     The string with tailing space.";
        String modifiedString = originalString.stripLeading();

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        //
        // Hint:
        //  If you find it difficult, please check https://www.javaprogramto.com/2019/02/Java-11-String-strip.html.
        // <--start
        final boolean areSame = false;
        // Reason: the original string dose not change
        // --end-->

        assertEquals("The string with tailing space.", modifiedString);
        assertEquals(areSame, originalString.equals(modifiedString));
    }

    @SuppressWarnings("unused")
    @Test
    void should_taken_string_apart() {
        final String originalString = "Java is great";

        // TODO:
        //  Take part of the original string according to expectation.
        //
        // Hint:
        //  If you find it difficult, please check page 60 of "Core Java Vol 1", section 3.6.1.
        // <--start
        final String partOfString = originalString.substring(5);
        // --end-->

        final String expectedString = "is great";

        assertEquals(expectedString, partOfString);
    }

    @SuppressWarnings("unused")
    @Test
    void should_taken_string_apart_continued() {
        final String originalString = "Java is great.";

        // TODO:
        //  Take part of the original string according to expectation.
        //
        // Hint:
        //  If you find it difficult, please check page 60 of "Core Java Vol 1", section 3.6.1
        // <--start
        final String partOfString = originalString.substring(5, 7);
        // --end-->

        final String expectedString = "is";

        assertEquals(expectedString, partOfString);
    }

    /*
     * Questions on take string apart.
     *
     * - What if the input arguments is out of range of the string?
     *   A: The program will throw IndexOutOfBoundsException.
     * - What will happen if the the starting index is greater than the ending index?
     *   A: The program will throw IndexOutOfBoundsException.
     * - What will happen if the input string is of null reference?
     *   A: The program will throw NullPointerException.
     */

    @SuppressWarnings({"unused"})
    @Test
    void should_break_string_into_words() {
        final String sentence = "This is Mike";

        // TODO: Extract words in the sentence.
        //
        // Hint:
        //  If you find it difficult, please check https://www.baeldung.com/string/split.
        // <--Start
        String[] words = null;
        // --End-->

        assertArrayEquals(new String[] {"This", "is", "Mike"}, words);
    }

    @SuppressWarnings({"unused"})
    @Test
    void should_break_string_into_words_customized() {
        final String sentence = "This/is/Mike";

        // TODO: Extract words in the sentence.
        // <--Start
        String[] words = null;
        // --End-->

        assertArrayEquals(new String[] {"This", "is", "Mike"}, words);
    }

    @SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfStringBuilder"})
    @Test
    void should_create_ascii_art() {
        final int width = 5;
        final int height = 3;

        // TODO: Create string using StringBuilder
        //
        // Hint:
        //  If you find it difficult, please check page 60 of "Core Java Vol 1", section 3.6.9
        // <--Start
        StringBuilder builder = new StringBuilder();
        // --End-->

        final String expected =
                "|---|\n" +
                "|   |\n" +
                "|---|\n";

        assertEquals(expected, builder.toString());
    }

    @SuppressWarnings("unused")
    @Test
    void should_reverse_a_string() {
        final String original = "123456";

        // TODO:
        //  Modify the following code to create new string from original String
        //
        // Hint:
        //  If you find it difficult, please check https://www.baeldung.com/java-reverse-string.
        // <--Start
        final String reversed = null;
        // --End-->

        assertEquals("654321", reversed);
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void should_compare_string_with_different_cases() {
        final String upperCased = "HELLO";
        final String lowerCased = "hello";

        final boolean equalResult = upperCased.equals(lowerCased);
        final boolean equalIgnoreCaseResult = upperCased.equalsIgnoreCase(lowerCased);

        // TODO:
        //  Please change the value of the following 2 lines to pass the test.
        // <--start
        final boolean actualResultOfEqual = false;
        final boolean actualResultOfEqualIgnoreCase = false;
        // --end-->

        assertEquals(equalResult, actualResultOfEqual);
        assertEquals(equalIgnoreCaseResult, actualResultOfEqualIgnoreCase);
    }

    @Test
    void should_format_string() {
        final String name = "Harry";
        final int age = 23;

        String text = String.format("Hello, %s. Next year, you will be %d.", name, age);

        // TODO: please modify the following code to pass the test
        //
        // Hint:
        //  If you meet difficulties, please refer to "Core Java Vol 1", section 3.7.2.
        // <--start
        final String expectedText = "";
        // --end-->

        assertEquals(expectedText, text);
    }

    /*
     * - List other string format conversion chars.
     *   * d - decimal integer
     *   * x - hexadecimal integer
     *   * o - octal integer
     *   * f - fixed-point floating point
     *   * e - exponential floating point
     *   * g - general floating point (the shorter of e and f)
     *   * a - hexadecimal floating point
     *   * s - string
     *   * c - character
     *   * b - boolean
     *   * h - hash code
     *   * n - platform dependent line separator
     */
}
