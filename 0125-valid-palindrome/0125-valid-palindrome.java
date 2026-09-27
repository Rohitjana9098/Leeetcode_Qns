class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string (keep only lowercase alphanumeric characters)
        StringBuilder cleanStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanStr.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Call helper with cleaned string and initial pointers
        String str = cleanStr.toString();
        return helper(str, 0, str.length() - 1);
    }

    private boolean helper(String s, int low, int high) {
     
        int len = high - low + 1;

        // Base case: 0 or 1 character left
        if (len <= 1) {
            return true;
        }

        if (s.charAt(low) != s.charAt(high)) {
            return false;
        }

        // Recursive step
        return helper(s, low + 1, high - 1);
    }
}