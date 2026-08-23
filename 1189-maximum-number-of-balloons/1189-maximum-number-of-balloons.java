class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> have = new HashMap<>();
        for(int i = 0 ; i < text.length(); i++) {
            char c = text.charAt(i);
            have.put(c,have.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);
        return max_num_ballons(need,have);
    }

    private int max_num_ballons(Map<Character, Integer> need, Map<Character, Integer> have) {
        int min_ballon = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry : need.entrySet()) {
            char c = entry.getKey();
            int fNeed = entry.getValue();
            int fHave = have.getOrDefault(c,0);
            int times = fHave / fNeed;
            min_ballon = Math.min( min_ballon,times);
        }
        return min_ballon;
    }
}