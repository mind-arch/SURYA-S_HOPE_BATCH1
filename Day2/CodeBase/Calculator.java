import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
        sc.close();
    }
}