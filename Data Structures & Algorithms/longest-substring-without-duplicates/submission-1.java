class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charsSet = new HashSet<>();
        int res = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            while(charsSet.contains(s.charAt(i))) {
                charsSet.remove(s.charAt(j));
                j++;
            }
            charsSet.add(s.charAt(i));
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}
