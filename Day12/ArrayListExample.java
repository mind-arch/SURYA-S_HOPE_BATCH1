import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        list.add(null);
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.add(0, 15);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(0, 5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.contains(10));
        System.out.println(list.contains(5));
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}