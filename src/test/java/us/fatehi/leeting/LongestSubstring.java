package us.fatehi.leeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstring {
    @Test
    public void maintest() {

        LongestSubstring longestSubstring = new LongestSubstring();

        String longestSubstringValue;
        
        longestSubstringValue = longestSubstring.longestSubstring("");
        Assertions.assertEquals(true, "".equals(longestSubstringValue));

        longestSubstringValue = longestSubstring.longestSubstring("");
        Assertions.assertEquals(true, "".equals(longestSubstringValue));
    }

    private String longestSubstring(String string) {
        return null;
    }

}
