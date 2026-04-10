import java.util.HashSet;
public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice");

        System.out.println("Unique Names: " + uniqueNames);
    }
}