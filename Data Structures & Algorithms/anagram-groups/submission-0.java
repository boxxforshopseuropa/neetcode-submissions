class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 0) {
            return Collections.emptyList();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String sortedAnagram = String.valueOf(tmp);

            if (anagramMap.containsKey(sortedAnagram)) {
                anagramMap.get(sortedAnagram).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                anagramMap.put(sortedAnagram, list);
            }

        }

        System.out.println(strs);

        List<List<String>> result = anagramMap.values().stream().collect(Collectors.toUnmodifiableList());
        return result;
    }
}
