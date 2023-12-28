package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Longest Substring Without Repeating Characters
 * 
 * Windowing
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public abstract class ProblemLongestSubstring implements Problem {

        public abstract String longestSubstring(final String string);

        @Test
        public void testImplementation() {

                ProblemLongestSubstring longestSubstring =
                                (ProblemLongestSubstring) solutionObject();

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

                longestSubstringValue = longestSubstring.longestSubstring("tmmzuxt");
                Assertions.assertEquals("mzuxt", longestSubstringValue,
                                "String with Repeating Characters at the Middle");

                longestSubstringValue = longestSubstring.longestSubstring("aaaa");
                Assertions.assertEquals("a", longestSubstringValue,
                                "String with Only Repeating Characters");

        }

}
