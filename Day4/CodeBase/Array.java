import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("hashcode of the array is: " + Arrays.hashCode(arr));
        System.out.println("hashcode of the first element is: " + Integer.hashCode(arr[0]));
    
    }
}