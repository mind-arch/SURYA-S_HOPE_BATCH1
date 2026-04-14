import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);
  
        System.out.println("Iterating through the list:");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            Integer value = iterator.next();
            if (value == 20) {
                iterator.remove();
            }

        }
        System.out.println("After Iteration: " + list);

        System.out.println("Iterating again to show the current state of the list:");
        for (Integer num : list) {
            System.out.println(num);
        }
        
    }
}