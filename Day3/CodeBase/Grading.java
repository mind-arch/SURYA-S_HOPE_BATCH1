import java.util.Scanner;
public class Grading{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int marks;
        System.out.println("Enter the marks: ");
        marks = sc.nextInt();
        switch(marks){
            case 90:
                System.out.println("Grade: A");
                break;  
            case 80:
                System.out.println("Grade: B");
                break;
            case 70:
                System.out.println("Grade: C");
                break;
            case 60:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

    }
}