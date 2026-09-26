class Solution {
    public List<String> letterCasePermutation(String s) {
        List result = new ArrayList<>();
        Helper(s.toCharArray(),0,result);
        return result;
    }
    private void Helper(char[] chars, int index, List result) {
        //Base case
        if(index == chars.length) {
            result.add(new String(chars));
            return;
        }
        // Charcter case
        if(Character.isDigit(chars[index])) {
            Helper(chars,index+1,result);
            return;
        }
        // Keep/convert to Lowercase
        chars[index] = Character.toLowerCase(chars[index]);
        Helper(chars,index+1,result);
        //keep / convert to Uppercase
        chars[index] = Character.toUpperCase(chars[index]);
        Helper(chars,index+1,result);
    }
}