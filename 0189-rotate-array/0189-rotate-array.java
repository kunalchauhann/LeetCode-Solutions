class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int l=0;
        int r=n-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        int l1=0;
        int r1=k-1;
        while(l1<r1){
            int t=nums[l1];
            nums[l1]=nums[r1];
            nums[r1]=t;
            l1++;
            r1--;
        }
        int l2=k;
        int r2=n-1;
        while(l2<r2){
            int t=nums[l2];
            nums[l2]=nums[r2];
            nums[r2]=t;
            l2++;
            r2--;
        }
    }
}