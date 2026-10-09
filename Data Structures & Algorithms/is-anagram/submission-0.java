class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] schars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            schars[s.charAt(i) - 'a']++;
        }

        for(int j = 0; j < t.length(); j++) {
            if (schars[t.charAt(j) - 'a'] != 0) {
                schars[t.charAt(j) - 'a']--;
            } else {
                return false;
            }
        }

        return true;

    }
}
