import java.util.*;

class Solution {
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        
        backtrack(result, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String digits, int index, StringBuilder current) {
        // Base case: combination is complete
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get matching letters for current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}