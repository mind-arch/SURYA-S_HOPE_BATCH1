import java.util.Scanner;
public class max{
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1, n2 and n3: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 is greater than n2 and n3");
        }
        else if (n2>n3){
            System.out.println("n2 is greater than n1 and n3");
        }
        else{
            System.out.println("n3 is greater than n1 and n2");
        }
    }
}