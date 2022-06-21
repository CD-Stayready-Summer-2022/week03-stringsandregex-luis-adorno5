package com.codedifferentlty.regex.practice.part01.countingword;

import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegexWordCounterTest {

    @Test
    @DisplayName("Find one word test.")
    public void findOneWordTest() {
        String regex = "\\bcard\\b";
        int expected = 1;
        int actual = RegexWordCounter
                .countWordOccurrences(regex,
                        "cat, flat, card, tart, cat");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Find multiple words test.")
    void findMultipleWordsTest() {
        String regex = "\\bc[a-zA-Z]+t\\b";
        int expected = 2;
        int actual = RegexWordCounter
                .countWordOccurrences(regex,
                        "cat, flat, card, tart, cart");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Find words with given prefix.")
    void findWordsWithPrefixTest() {
        String regex = "\\bca[a-zA-Z]*";
        int expected = 3;
        int actual = RegexWordCounter
                .countWordOccurrences(regex,
                        "cat, flat, card, tart, cart");
        Assertions.assertEquals(expected, actual);
    }
}
