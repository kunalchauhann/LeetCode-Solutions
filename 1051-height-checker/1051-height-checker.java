class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int n = heights.length;
        int[] ex= new int[n];
        for(int i=0;i<n;i++){
            ex[i]=heights[i];
        }
        for(int i=0;i<n;i++){
            int min=ex[i];
            int h=i;
            for(int j=i;j<n;j++){
                if(ex[j]<min){
                    min=ex[j];
                    h=j;
                }
            }
            int temp = ex[i];
            ex[i]=ex[h];
            ex[h]=temp;
        }
        for(int i=0;i<n;i++){
            if(ex[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}