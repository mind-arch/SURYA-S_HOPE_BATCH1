import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorImplementation {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, 22, 85.5));
        students.add(new Student(2, 20, 90.0));
        students.add(new Student(3, 21, 78.0));

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });

        System.out.println("Students sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by marks
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.marks, s2.marks);
            }
        });


        System.out.println("\nStudents sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
      
       Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.rollno, s2.rollno);
            }
        });

        System.out.println("\nStudents sorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new AgeComparator());
        System.out.println("\nStudents sorted by age using AgeComparator:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new MarksComparator());
        System.out.println("\nStudents sorted by marks using MarksComparator:");
        for (Student student : students) {
            System.out.println(student);
        }


    }
}

class Student{
    int rollno;
    int age;
    double marks;
    public Student(int rollno, int age, double marks){
        this.rollno=rollno;
        this.age=age;
        this.marks=marks;
    }
    public String toString(){
        return "Roll No: "+this.rollno+" Age: "+this.age+" Marks: "+this.marks;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.marks, s2.marks);
    }
}

class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno);
    }
}

