import java.util.*;
public class StringBufferConcept{
    public static void main(String[] args){
        
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("The value of the StringBuffer is: " + sb);
        sb.append(" World");
        System.out.println("The value of the StringBuffer after appending is: " + sb);
       
    }
}