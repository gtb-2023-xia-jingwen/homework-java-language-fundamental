package com.tw.javabasic;

import com.tw.javabasic.util.EscapedChars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharTypeTest {
    @Test
    void should_describe_escaped_chars() {
        // TODO:
        //  Please write down the correct escaped characters.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 50 of "Core Java Vol 1", section 3.3.3.
        // <-start--
        final char backspace = ' ';
        final char tab = ' ';
        final char lineFeed = ' ';
        final char carriageReturn = ' ';
        final char doubleQuote = ' ';
        final char singleQuote = ' ';
        final char backslash = ' ';
        // --end-->

        Assertions.assertEquals(EscapedChars.BACKSPACE.getValue(), backspace);
        assertEquals(EscapedChars.TAB.getValue(), tab);
        assertEquals(EscapedChars.LINE_FEED.getValue(), lineFeed);
        assertEquals(EscapedChars.CARRIAGE_RETURN.getValue(), carriageReturn);
        assertEquals(EscapedChars.DOUBLE_QUOTE.getValue(), doubleQuote);
        assertEquals(EscapedChars.SINGLE_QUOTE.getValue(), singleQuote);
        assertEquals(EscapedChars.BACKSLASH.getValue(), backslash);
    }

    @Test
    void should_get_unicode_value_of_a_character() {
        final Character[] characters = {'a', 'b', '\u042A'};

        // TODO: Get UTF-16 value (in basic plane) of a character.
        //
        // <-start-
        int[] values = null;
        // --end->

        assertArrayEquals(new int[] {97, 98, 0x42a}, values);
    }

    public static boolean isWindows(String os) { return (os.contains("win")); }

    public static boolean isMac(String os) { return (os.contains("mac")); }

    public static boolean isUnix(String os) {
        return (os.contains("nix") || os.contains("nux") || os.contains("aix"));
    }
}