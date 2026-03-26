public class Thiskeyword{
    public static void main(String[] args) {
        Student S1= new Student("Surya", "24CS110");
        S1.display();
        System.out.println(S1.hashCode());


    }
}class Student {
    String name;
    String rollno;

    Student (String name , String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
    System.out.println("Name:"+name+"\nRollNo:"+rollno);

    }
}
