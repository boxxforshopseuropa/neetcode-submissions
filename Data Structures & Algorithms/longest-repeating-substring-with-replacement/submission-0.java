class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> chMap = new HashMap<>();
        int res = 0;
        int l = 0, maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            chMap.put(s.charAt(r), chMap.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, chMap.get(s.charAt(r)));

            while (r - l + 1 - maxf > k) {
                chMap.put(s.charAt(l), chMap.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r-l+ 1);
        }
        return res;
    }
}
