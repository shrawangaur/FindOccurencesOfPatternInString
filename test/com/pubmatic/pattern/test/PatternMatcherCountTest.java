package com.pubmatic.pattern.test;

import com.pubmatic.pattern.PatternMatcherCount;
import org.junit.Assert;
import org.junit.Test;

public class PatternMatcherCountTest {


    @Test
    public void should_return_zero_if_no_occurences_of_pattern_in_given_string_is_found(){
        //Given
        String pattern = "pubmaticassignment";
        String inputString = "rgrpubmaticfgjjepubmaticeirjewijowpubmaticjterhthe";

        //When
        PatternMatcherCount patternMatcherCount = new PatternMatcherCount();
        int count = patternMatcherCount.countOccurancesOfPatternInString(inputString, pattern);

        //Then
        Assert.assertEquals(0,count);
    }

    @Test
    public void should_find_number_of_occurences_of_pattern_in_given_string(){
        //Given
        String pattern = "pubmatic";
        String inputString = "rgrpubmaticfgjjepubmaticeirjewijowpubmaticjterhthe";

        //When
        PatternMatcherCount patternMatcherCount = new PatternMatcherCount();
        int count = patternMatcherCount.countOccurancesOfPatternInString(inputString, pattern);

        //Then
        Assert.assertEquals(3,count);
    }
}
