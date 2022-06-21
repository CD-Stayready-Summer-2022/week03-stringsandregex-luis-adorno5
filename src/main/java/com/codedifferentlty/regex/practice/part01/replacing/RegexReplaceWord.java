package com.codedifferentlty.regex.practice.part01.replacing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplaceWord {

    public static String replaceFirst(String regex, String replace, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceFirst(replace);
    }

    public static String replaceAll(String regex, String replace, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceAll(replace);
    }

    public static String replaceNthWord(String regex, String replace, String input, int occurence){
        int count = 0;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while(m.find()){
            count++;
            if(count == occurence){
                return m.replaceFirst(replace);
            }
        }
        return null;
    }

}
