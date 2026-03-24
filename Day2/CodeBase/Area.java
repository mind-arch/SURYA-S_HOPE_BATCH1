import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        int length, breadth;
        Scanner next = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        length = next.nextInt();
        breadth = next.nextInt();
        System.out.println("Area of rectangle: " + (length*breadth));
        next.close();
    }
}