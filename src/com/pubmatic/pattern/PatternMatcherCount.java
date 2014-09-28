package com.pubmatic.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherCount {

    public int countOccurancesOfPatternInString(String inputString, String pattern) {
        Pattern patternRegex = Pattern.compile(pattern);
        Matcher matcher = patternRegex.matcher(inputString);
        int count = 0;
        while (matcher.find()){
            count +=1;
        }
        return count;
    }
}
