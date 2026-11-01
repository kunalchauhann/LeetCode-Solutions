class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int min = nums[i];
            int h =i;
            for(int j=i;j<n;j++){
                if(min>nums[j]){
                    min=nums[j];
                    h=j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[h];
            nums[h]=temp;
        }
    }
}