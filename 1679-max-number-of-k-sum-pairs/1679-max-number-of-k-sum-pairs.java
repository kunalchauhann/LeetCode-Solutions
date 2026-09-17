class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int l=0;
        int r = nums.length-1;
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum<k){
                l++;
            }else if(sum>k){
                r--;
            }else{
                count++;
                l++;
                r--;
            }
        }
        return count;
    }
}