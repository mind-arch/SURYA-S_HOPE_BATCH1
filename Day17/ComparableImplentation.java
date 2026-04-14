import java.util.*;


public class ComparableImplentation {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));
        Collections.sort(students, Collections.reverseOrder());

        for (Student student : students) {
            System.out.println(student.name + " " + student.rollno);
        }
    }
}

class Student implements Comparable<Student> {
    public String name;
    public int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.rollno, other.rollno);
    }
}
