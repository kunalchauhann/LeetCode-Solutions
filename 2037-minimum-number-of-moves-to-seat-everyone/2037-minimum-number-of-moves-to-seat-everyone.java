class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count=0;
        int n = Math.max(seats.length,students.length);
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++){
            int sm1=seats[i];
            int sm2=students[i];
            while(sm1!=sm2){
                if(sm1<sm2){
                    sm2--;
                    count++;
                }else if(sm1>sm2){
                    sm2++;
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}