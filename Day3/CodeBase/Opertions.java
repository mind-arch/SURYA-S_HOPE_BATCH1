import java.util.Scanner;
public class Opertions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operators=sc.next();
        switch(operators){
            case "+":
                System.out.println(" Sum of a and b: " + (a+b));
                break;
            case "-":
                System.out.println(" Difference of a and b: " + (a-b));
                break;
            case "*":
                System.out.println(" Product of a and b: " + (a*b));
                break;
            case "/":
                System.out.println(" Quotient of a and b: " + (a/b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}