class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = 2*k+1;
        int [] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        if(nums.length<n){
            return ans;
        }
        long sum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        ans[k]=(int)(sum/n);
        for(int i=k+1;i<nums.length-k;i++){
            sum = sum - nums[i-k-1] + nums[i+k];
            ans[i]=(int)(sum/n);
        }
        return ans;
    }
}