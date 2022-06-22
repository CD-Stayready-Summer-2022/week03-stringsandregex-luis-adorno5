package com.codedifferentlty.regex.practice.part02.playrewriter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayReWriterTest {

    String hamlet;
    PlayReWriter playReWriter;

    @BeforeEach
    void setUp() throws IOException {
        Path hamletStoryFilePath =
                Path.of("./files/Hamlet.txt");
        hamlet = Files.readString(hamletStoryFilePath);
        playReWriter = new PlayReWriter();
    }

    @Test
    public void characterNameChangerTest01(){
        String regex = "(HORATIO)\\b";
        int expected = -1;
        int actual = playReWriter.characterNameChanger(regex,
                "LUIS", hamlet).indexOf("HORATIO");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void locationNameChangerTest01(){
        String regex = "(Denmark)\\b";
        int expected = -1;
        int actual = playReWriter.locationNameChanger(regex,
                "Puerto Rico", hamlet).indexOf("Denmark");
        Assertions.assertEquals(expected, actual);
    }

}
