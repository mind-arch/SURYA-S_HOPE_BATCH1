class Solution {
    public int[] plusOne(int[] digits) {
      int n=digits.length;
    for(int i =n-1;i>=0;i--){
        if(digits[i]==9 && i !=0){
            digits[i]=0;
        }
        else if (digits[i]==9 && i ==0){
            digits[i]=0;
            int[] arr = new int[n+1];
            arr[0]=1;
            int j=1;
            for(int k =0;k<n;k++){
               arr[j]=digits[k];
               j++;
            }
            return arr;

        }
        else{
          digits[i]= digits[i]+1;
        return digits;  
        }
    }
    return digits;
}
}