package com.codedifferentlty.regex.practice.part02.playrewriter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayReWriter {

    public String characterNameChanger(String regex,
                                       String characterName,
                                       String input){
        // Given a block of text, and given a charcters name,
        // will alter every occurance of that name.
        // Example: "HORATIO: Friends to this ground."
        // would be changed to "FlavaFlav: Friends to this ground."
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(characterName);
    }

    public String locationNameChanger(String regex,
                                       String locationName,
                                       String input){
        // Given a block of text, and given a locations name,
        // will alter every occurance of that location.
        // Example: "In which the majesty of buried Denmark"
        // would be changed to "In which the majesty of buried Wilmington"
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(locationName);
    }


}
