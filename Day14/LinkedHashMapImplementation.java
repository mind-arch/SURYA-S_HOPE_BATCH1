import java.util.HashMap;

public class LinkedHasMapImplementation {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);

        System.out.println("Student Marks: " + studentMarks);
        System.out.println("Alice's Marks: " + studentMarks.get("Alice"));
        System.out.println("Contains Bob? " + studentMarks.containsKey("Bob"));
        System.out.println("Contains Marks 90? " + studentMarks.containsValue(90));
        System.out.println("Size of Map: " + studentMarks.size());
        studentMarks.remove("Charlie");
        System.out.println("After Removing Charlie: " + studentMarks);
    }
}