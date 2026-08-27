class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int n1=n;
            int pro=1;
            while(n1>0){
            int digit=n1%10;
            pro*=digit;
            n1/=10;
            }
            if(pro%t==0){
                return n;
            }
            n++;
        }
        }
    }