import java.util.HashMap;
public class MaximumSubArrayWithSumZero {

public static void main(String[] args) {
        MaximumSubArrayWithSumZero solution = new MaximumSubArrayWithSumZero();
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        int result = solution.maxLen(arr, n);
        System.out.println("Length of the longest subarray with sum zero: " + result);
    }

    public int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
    
}