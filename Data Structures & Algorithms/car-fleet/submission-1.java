class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int res = 0;

        int length = position.length;
        if (length == 1) {
            return 1;
        }

        Map<Integer, List<Integer>> posCars = new TreeMap<>(Comparator.reverseOrder());
        Stack<Double> finishReachStack = new Stack<>();

        for (int i = 0; i < length; i++) {
            posCars.computeIfAbsent(position[i], (k) -> new ArrayList<>()).add(speed[i]);
        }
        for (Map.Entry<Integer, List<Integer>> entry : posCars.entrySet()) {
            double finishReachSteps = (double) (target - entry.getKey()) / entry.getValue().getFirst();
            finishReachStack.push(finishReachSteps);

            if (finishReachStack.size() >= 2 && finishReachStack.peek() <= finishReachStack.get(finishReachStack.size() - 2)) {
                finishReachStack.pop();
            }
        }

        return finishReachStack.size();
    }
}
