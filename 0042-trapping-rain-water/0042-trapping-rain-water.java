class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int count=0;
       int []left = new int[n];
       int []right= new int[n];
       int max=height[0];
       for(int i=0;i<n;i++){
        if(height[i]>max){
            max=height[i];
        }
        left[i]=max;
       } 
       int max2=height[n-1];
       for(int i=n-1;i>=0;i--){
        if(height[i]>max2){
            max2=height[i];
        }
        right[i]=max2;
       }
       for(int i=0;i<n;i++){
        int min = Math.min(left[i],right[i]);
        int water = (min-height[i]);
        count+=water;
       }
       return count;
    }
}