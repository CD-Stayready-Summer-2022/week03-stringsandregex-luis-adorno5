package com.codedifferentlty.regex.practice.part02.readingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadingInDataMethod01 {
    public static String readDataIn(String pathToFile) throws IOException {
        Path fileName = Path.of(pathToFile);
        return Files.readString(fileName);
    }

    public static String readDataInAndReplace(String pathToFile,
                                              String regex,
                                              String replace){
        String dataWithReplacement = "";
        try {
            Matcher matcher = setupPatternAndMatcher(regex, readDataIn(pathToFile));
            dataWithReplacement = replaceDataWithSelected(matcher, replace);
        }catch (IOException ex){
            printExceptionToConsole(ex);
        }
        return dataWithReplacement;
    }

    private static String replaceDataWithSelected(Matcher matcher, String replace){
        return matcher.replaceAll(replace);
    }

    private static Matcher setupPatternAndMatcher(String regex, String data){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(data);
    }

    private static void printExceptionToConsole(IOException ex){
        System.out.println("Error: No file " + ex.getMessage());
    }

}
