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
        Assertions.assertEquals("", longestSubstringValue, "Empty String");

        longestSubstringValue = longestSubstring.longestSubstring("a");
        Assertions.assertEquals("a", longestSubstringValue,
                "String with a Single Character");

        longestSubstringValue = longestSubstring.longestSubstring("abcdef");
        Assertions.assertEquals("abcdef", longestSubstringValue,
                "String with All Unique Characters");

        longestSubstringValue = longestSubstring.longestSubstring("abcabcbb");
        Assertions.assertEquals("abc", longestSubstringValue,
                "String with Repeating Characters");

        longestSubstringValue = longestSubstring.longestSubstring("bbabcdef");
        Assertions.assertEquals("abcdef", longestSubstringValue,
                "String with Repeating Characters at the Beginning");

        longestSubstringValue = longestSubstring.longestSubstring("abcdeff");
        Assertions.assertEquals("abcdef", longestSubstringValue,
                "String with Repeating Characters at the End");

        longestSubstringValue = longestSubstring.longestSubstring("aaaa");
        Assertions.assertEquals("a", longestSubstringValue,
                "String with Only Repeating Characters");
    }

    private String longestSubstring(final String string) {
        if (string == null || string.length() == 0) {
            return "";
        }
        if (string.length() == 1) {
            return string;
        }
        return null;
    }

}
