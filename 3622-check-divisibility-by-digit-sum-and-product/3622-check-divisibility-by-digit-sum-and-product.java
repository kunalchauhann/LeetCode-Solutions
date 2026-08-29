class Solution {
    public boolean checkDivisibility(int n) {
        int n1=n;
        int sum=0;
        int pro =1;
        int fin=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            pro*=digit;
            n/=10;
        }
        fin= sum+pro;
        if(n1%fin==0){
            return true;
        }else{
            return false;
        }
    }
}