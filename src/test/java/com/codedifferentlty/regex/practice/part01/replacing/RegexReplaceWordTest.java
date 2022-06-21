package com.codedifferentlty.regex.practice.part01.replacing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegexReplaceWordTest {

    String input;
    String replace;

    @BeforeEach
    void setUp() {
        input = "The dog says meow. All dogs say meow.";
        replace = "duck";
    }

    @Test
    void replaceFirstTest() {
        String regex = "\\bdog";
        String expected = "The duck says meow. All dogs say meow.";
        String actual = RegexReplaceWord
                .replaceFirst(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void replaceAllTest() {
        String regex = "\\bme[a-z]+";
        String expected = "The dog says duck. All dogs say duck.";
        String actual = RegexReplaceWord
                .replaceAll(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void replaceNthOccurenceTest() {
        String regex = "\\bMe\\b";
        String input = "I throw the soccer ball. Me score a goal.";
        String replace = "I";
        String expected = "I throw the soccer ball. I score a goal.";
        String actual = RegexReplaceWord.replaceNthWord(regex, replace,
                input, 1);
        Assertions.assertEquals(expected, actual);
    }
}
