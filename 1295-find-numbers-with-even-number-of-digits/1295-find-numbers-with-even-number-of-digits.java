class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int even=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                even++;
            }if(even%2==0){
                count++;
            }
        }
        return count;
    }
}