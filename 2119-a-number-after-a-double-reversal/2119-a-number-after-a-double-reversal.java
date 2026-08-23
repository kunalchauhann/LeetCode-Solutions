class Solution {
    public boolean isSameAfterReversals(int num) {
        int ori = num;
        boolean isSameAfterReversals;
        int temp=0;
        int temp2=0;
        while(num>0){
            int digit=num%10;
            temp = temp*10+digit;
            num=num/10;
        }
        while(temp>0){
            int digit=temp%10;
            temp2 = temp2*10+digit;
            temp=temp/10;
        }
        if(temp2==ori){
            isSameAfterReversals=true;
        }else{
             isSameAfterReversals=false;
        }
        return isSameAfterReversals;
    }
}