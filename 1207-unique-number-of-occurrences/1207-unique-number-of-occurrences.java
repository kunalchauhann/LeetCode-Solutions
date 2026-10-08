class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int z=0;
        int []ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean al = false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    al=true;
                    break;
                }
            }
            if(al){
                continue;
            }
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            ans[z]=count;
            z++;
        }
        for(int i = 0; i < z; i++){
    for(int j = i + 1; j < z; j++){
        if(ans[i] == ans[j]){
            return false;
        }
    }
}
        return true;
    }
}