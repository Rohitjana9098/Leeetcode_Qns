class Solution {
    public String removeOccurrences(String s, String part) {
        // Base Case: If the substring 'part' is no longer present in 's', return 's'
        int index = s.indexOf(part);
        if (index == -1) {
            return s;
        }

        // Small Calculation: Remove the first occurrence of 'part'
        String smallString = s.substring(0, index) + s.substring(index + part.length());

        // Recursive Call (Trust): Process the remaining string
        return removeOccurrences(smallString, part);
    }
}