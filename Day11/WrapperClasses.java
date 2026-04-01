
import javax.xml.parsers.FactoryConfigurationError;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        System.out.println("Value of a: "+a);

        Integer b = 10; // Reference copy
        System.out.println("Value of b: "+b);
        System.out.println(a==b); // false  
        System.out.println(b.hashCode());
        Character c = new Character('A');
        System.out.println("Value of c: "+c);
        System.out.println(c.hashCode());
        Integer obj = new Integer(10);
        System.err.println(a==obj); // false
        System.out.println(a.equals(obj)); // true

        Float f1 = new Float(3.14f);
        Float f2 = new Float(3.14f);
        Float f3 = f1;
        System.out.println("Value of f1: "+f1);
        System.out.println("Value of f2: "+f2); 
        System.out.println("Value of f3: "+f3);

        System.out.println(f1==f2); // false
        System.out.println(f1.equals(f2)); // true
        System.out.println(f1==f3); // true
        

          
    }
}