class Solution {
    public boolean judgeSquareSum(int c) {
        
        int l=0;
        int r=(int)Math.sqrt(c);
        while(l<=r){
            long sum=(long)l*l+(long)r*r;
            if(sum>c){
                r--;
            }else if(sum<c){
                l++;
            }else{
                return true;
            }
        }
        return false;
    }
}