package us.fatehi.leeting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
        Assertions.assertEquals("a", longestSubstringValue, "String with a Single Character");

        longestSubstringValue = longestSubstring.longestSubstring("abcdef");
        Assertions.assertEquals("abcdef", longestSubstringValue,
                "String with All Unique Characters");

        longestSubstringValue = longestSubstring.longestSubstring("abcabcbb");
        Assertions.assertEquals("abc", longestSubstringValue, "String with Repeating Characters");

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

    private String longestSubstring(final String string) {
        if (string == null || string.length() == 0) {
            return "";
        }
        System.out.println(">           " + string);
        final Set<Integer> foundCodePoints = new HashSet<>();
        int start = 0;
        int end = 1;
        int longest_start = 0;
        int longest_end = 1;
        foundCodePoints.add(string.codePointAt(0));
        while (end < string.length()) {
            int codePointAtEnd = string.codePointAt(end);
            if (foundCodePoints.contains(codePointAtEnd)) {
                // Move the start pointer to the matching character
                while (string.codePointAt(start) != codePointAtEnd) {
                    // Remove characters that we are skipping over
                    int codePointAtStart = string.codePointAt(start);
                    foundCodePoints.remove(codePointAtStart);
                    start = start + 1;
                }
                // Now the matching character is at the start of the substring,
                // so advance and eliminate it
                start = start + 1;
            }
            foundCodePoints.add(codePointAtEnd);
            end = end + 1;
            if ((end - start) > (longest_end - longest_start)) {
                longest_start = start;
                longest_end = end;
            }
            System.out.printf("- [%2d - %2d] %s {window %s}%n", longest_start, longest_end,
                    string.substring(longest_start, longest_end), string.substring(start, end));
        }
        return string.substring(longest_start, longest_end);
    }

}
