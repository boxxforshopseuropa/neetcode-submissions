class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int res = 1;

        Set<Character> charsSet = new HashSet<>();

        charsSet.add(s.charAt(0));
        int i = 0;
        int j = i+1;
        int count = 1;
        while (j < s.length()) {
            char charAt = s.charAt(j);
            if (!charsSet.contains(charAt)) {
                charsSet.add(charAt);
                count++;
                res = Math.max(count, res);
                j++;
            } else {
                count = 1;
                charsSet.clear();
                i++;
                charsSet.add(s.charAt(i));
                j = i + 1;
            }
        }

        return res;
    }
}
