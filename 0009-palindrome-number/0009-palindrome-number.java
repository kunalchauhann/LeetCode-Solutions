class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalindrome;
        int ori=x;
        int temp=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit=x%10;
            temp=temp*10+digit;
            x/=10;
        }
        if(ori==temp){
            isPalindrome= true;
        }else{
            isPalindrome= false;
        }
        return isPalindrome;
    }
}