class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s1.length();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("checkpoint1");
        int left = 0;
        while (left < s2.length()) {
            char charAt = s2.charAt(left);
            if (!map.containsKey(charAt)) {
                left++;

            } else {
                if (left + n > s2.length()) {
                    return false;
                }
                String substring = s2.substring(left, left + n);
//                System.out.println(substring);
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    boolean isBrake = false;
                    for (int i = 0; i < entry.getValue(); i++) {
                        int indexOf = substring.indexOf(entry.getKey());
                        if (indexOf != -1) {
                            substring = substring.replaceFirst(entry.getKey().toString(), "");
                        } else {
                            left++;
                            isBrake = true;
                            break;
                        }
                    }
                    if (isBrake) {
                        break;
                    }
                }
                if (substring.length() == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
