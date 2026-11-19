class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count=0;
        int n = Math.max(seats.length,students.length);
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++){
            count+=Math.abs(seats[i]-students[i]);
        }
        return count;
    }
}