class Solution {
    public int findPeakElement(int[] nums) {
        int index=-1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }for(int i =0;i<nums.length;i++){
            if(max==nums[i]){
                index=i;
                break;
            }
        }
        return index;
    }
}