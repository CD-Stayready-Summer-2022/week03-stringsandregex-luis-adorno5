package com.codedifferentlty.regex.practice.part00;

public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public long repeatedString(String s, long n) {
        /*
        if s.length == 1 && s.charAt(0) == 'a'
            return n
        n/s.length
        n % s.length
        count = 0
        for i = 0; i<s.length; i++
            if s.charAt(i) == 'a'
                count++
        */
        int count = 0;
        long fit = (n/s.length());
        long remainder = n % s.length();

        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a')
                count++;
        }

        long result = count * fit;

        if (remainder > 0)
            for (int i = 0; i<remainder; i++)
                if(s.charAt(i) == 'a')
                    result++;

        return result;
    }
}
