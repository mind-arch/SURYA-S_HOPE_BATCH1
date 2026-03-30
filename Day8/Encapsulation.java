public class Encapsulation {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("Surya");
        s1.setRollno("24CS110");
        System.out.println("Name:"+s1.getName()+"\nRollNo:"+s1.getRollno());
    }
}

class Student1 {
    private String name;
    private String rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}