class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> have = new HashMap<>();

        for(int i = 0 ; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            have.put(c,have.getOrDefault(c,0)+1);
        }
        return checkRequirement(need,have);

    }

    public boolean checkRequirement(Map<Character,Integer> need ,Map<Character,Integer> have ) {
        for(Map.Entry<Character , Integer> entry : need.entrySet()) {
            char c = entry.getKey();
            int fNeed = entry.getValue();
            int fHave = have.getOrDefault(c,0);
            if(fHave < fNeed) {
                return false;
            }
        }
        return true;
    }

}