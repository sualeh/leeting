package us.fatehi.leeting.solutions;

import java.util.HashSet;
import java.util.Set;
import us.fatehi.leeting.problems.ProblemLongestSubstring;


public class LongestSubstring extends ProblemLongestSubstring {

    public String longestSubstring(final String string) {
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

    @Override
    public Object solutionObject() {
        return new LongestSubstring();
    }

}
