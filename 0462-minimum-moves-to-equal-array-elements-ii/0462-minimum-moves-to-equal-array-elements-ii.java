class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0;
        int dif=0;
        if(nums.length%2!=0){
            mid=nums[nums.length/2];
        }else{
            mid=nums[nums.length/2-1];
        }
        for(int i=0;i<nums.length;i++){
            dif+=Math.abs(nums[i]-mid);
        }
        return dif;
    }
}