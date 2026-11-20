class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i <= n-k; i++) {

            int diff = Math.abs(nums[i] - nums[i+k-1]);

            min = Math.min(min, diff);
        }

        return min;
    }
}