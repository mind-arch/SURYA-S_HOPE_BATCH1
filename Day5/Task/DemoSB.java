import java.util.*;

public class DemoSB {
    public static void main(String[] args) {

        // StringBuilder
        StringBuilder sb = new StringBuilder("hello");

        System.out.println("Original: " + sb);

        sb.append(" world");
        System.out.println("Append: " + sb);

        sb.insert(5, "X");
        System.out.println("Insert: " + sb);

        sb.delete(5, 6);
        System.out.println("Delete: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        System.out.println("CharAt(1): " + sb.charAt(1));

        sb.setCharAt(1, 'A');
        System.out.println("SetCharAt: " + sb);

        System.out.println("Length: " + sb.length());

        // StringBuffer (same methods)
        StringBuffer sbf = new StringBuffer("Java");

        sbf.append(" Programming");
        System.out.println("StringBuffer Append: " + sbf);
    }
}