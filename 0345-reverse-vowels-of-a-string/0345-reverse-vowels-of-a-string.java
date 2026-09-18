class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r = s.length()-1;
        char [] ch = s.toCharArray();
        while(l<r){
            if("aeiouAEIOU".indexOf(s.charAt(l))==-1){
                l++;    
            }else if("aeiouAEIOU".indexOf(s.charAt(r))==-1){
                r--;
            }else{
                char c=ch[l];
                ch[l]=ch[r];
                ch[r]=c;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}