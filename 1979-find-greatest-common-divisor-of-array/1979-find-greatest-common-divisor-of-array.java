class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max= nums[nums.length-1];
        int min= nums[0];
        int k=0;
        for(int i=1;i<=max;i++){
            if(max%i==0&&min%i==0){
                k=i;
            }
        }
        return k;
    }
}