class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        boolean res = true;
        while(i < j) {
            char ci = s.charAt(i);
            if (!isAlfaNumeric(ci)) {
                i++;
                continue;
            }
            char cj = s.charAt(j);
            if (!isAlfaNumeric(cj)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return res;
    }

    private boolean isAlfaNumeric(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
