import java.util.ArrayList;

public class RemoveImplementation {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original List: " + names);

       for ( String s : names) {
            if (s.equals("Bob")) {
                names.remove(s);
            }
        }
        System.out.println("Final List: " + names);
    }
}