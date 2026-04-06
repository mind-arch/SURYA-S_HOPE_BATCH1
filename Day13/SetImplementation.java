import java.util.HashSet;
public class SetImplementation {
    public static void main(String[] args) {
       HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice"); // Duplicate entry

        System.out.println("Unique Names: " + uniqueNames);
    }
}