class Solution {
    public int minimumLength(String s) {
        int l=0;
        int r=s.length()-1;
        
        while(l<r){
            char c = s.charAt(l);
            if(s.charAt(l)!=s.charAt(r)){
                break;
            }else{
                while(l<=r&&s.charAt(r)==c){
                    r--;
                }
                while(l<=r&&s.charAt(l)==c){
                    l++;
                }
            }
        }
        return r - l + 1;
    }
}