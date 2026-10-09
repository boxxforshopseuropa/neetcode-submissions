class Solution {
    public boolean isValidSudoku(char[][] board) {
        int size = board.length;
        int[][] intBoard = convertToIntArray(board);
        HashSet<Integer> row = new HashSet<>();
        Map<Integer, HashSet<Integer>> columns = new HashMap<>();
        Map<Integer, HashSet<Integer>> sectors = new HashMap<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (intBoard[i][j] != 0) {
                    if (!row.add(intBoard[i][j])) {
                        return false;
                    }

                    HashSet<Integer> columnSet = columns.getOrDefault(j, new HashSet<>());
                    if (!columnSet.add(intBoard[i][j])) {
                        return false;
                    }
                    columns.put(j, columnSet);


                    int key = (i/3) * 3 + j/3;
                    HashSet<Integer> sectorSet = sectors.getOrDefault(key, new HashSet<>());
                    if (!sectorSet.add(intBoard[i][j])) {
                        return false;
                    }
                    sectors.put(key, sectorSet);
                }
            }
            row.clear();
        }
        return true;
    }

    private int[][] convertToIntArray(char[][] charboard) {
        int size = charboard.length;
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (charboard[i][j] == '.') {
                    res[i][j] = 0;
                } else {
                    res[i][j] = charboard[i][j] - '0';
                }
            }
        }
        return res;
    }
}
