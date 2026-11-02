class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        String[] ans = new String[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {

            int max = Integer.MIN_VALUE;
            int maxInx = -1;

            for (int j = 0; j < n; j++) {
                if (!used[j] && score[j] > max) {
                    max = score[j];
                    maxInx = j;
                }
            }

            used[maxInx] = true;

            if (i == 0) {
                ans[maxInx] = "Gold Medal";
            }
            else if (i == 1) {
                ans[maxInx] = "Silver Medal";
            }
            else if (i == 2) {
                ans[maxInx] = "Bronze Medal";
            }
            else {
                ans[maxInx] = String.valueOf(i + 1);
            }
        }

        return ans;
    }
}