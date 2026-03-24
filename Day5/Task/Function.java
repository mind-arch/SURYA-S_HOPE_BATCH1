import java.util.*;
public class Function {
    public void sum(int a, int b){
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);

    }
    public void sum(){
        int sum = 0;
        System.out.println("The sum of the two numbers is: " + sum);
    }
    public int sum1(){
        int sum = 0;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Function func = new Function();
        func.sum(num1, num2);
        func.sum();
        System.out.println("The sum of the two numbers is: " + func.sum1());

        
    }
    }

