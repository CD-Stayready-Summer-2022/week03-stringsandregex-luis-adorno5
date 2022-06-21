package com.codedifferentlty.regex.practice.part02.playrewriter;

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
    void characterNameChangerTest01(){
        String regex = "(HORATIO)\\b";
        String actual = playReWriter.characterNameChanger(regex,
                "HORATIO", hamlet);
    }
}
