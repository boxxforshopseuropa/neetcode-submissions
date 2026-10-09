class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> fleetStack = new Stack<>();
        for (int[] p : pair) {
            fleetStack.push((double) (target - p[0]) / p[1]);
            if (fleetStack.size() >= 2 && fleetStack.peek() <= fleetStack.get(fleetStack.size() - 2)) {
                fleetStack.pop();
            }
        }
        return fleetStack.size();
    }
}
