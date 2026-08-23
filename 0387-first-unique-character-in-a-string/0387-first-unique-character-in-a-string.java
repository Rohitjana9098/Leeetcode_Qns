class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freqMap = new HashMap<>();

        for(int i = 0 ; i < s.length();i++) {
            char c = s.charAt(i);
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length();i++) {
            if(freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}