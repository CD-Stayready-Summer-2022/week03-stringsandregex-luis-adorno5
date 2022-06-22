package com.codedifferentlty.regex.practice.part02.readingFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReadingInDataMethod1Test {

    @Test
    void readDataInAndReplaceTest01() {
        String regex = "(always)\\b";
        String replace = "NEVER";
        String expected = "Code Differently\n" +
                "Our Students NEVER forget to write their unit test.";
        String actual = ReadingInDataMethod01.
                readDataInAndReplace("./files/Sample1.txt",
                        regex, replace);
        Assertions.assertEquals(expected, actual);
    }
}
