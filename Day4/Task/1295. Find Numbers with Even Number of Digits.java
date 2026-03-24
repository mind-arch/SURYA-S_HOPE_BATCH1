class Solution {
    public int findNumbers(int[] nums) {
     int count,evecnt=0;

     for(int num : nums){
        count=0;
       while(num>0){
        count++;
        num/=10;
       }
       if(count%2==0){
        evecnt++;
       }
     }
     return evecnt;
    }
}