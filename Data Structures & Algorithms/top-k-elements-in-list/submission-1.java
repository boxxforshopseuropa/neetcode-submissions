class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i : nums) {
            res.putIfAbsent(i, 0);
            res.put(i, res.get(i) + 1);
        }


        int[] result = res.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(x -> x.intValue())
                .toArray();
        return result;
    }
}
