class SuperExample1{
   int a=10;
   String b="Hello";

    void display(){
        System.out.println("Welcome to SuperExample1");
    }
}

class SuperExample2 extends SuperExample1{

    void display(){
        super.display();
        System.out.println("Welcome to SuperExample2");
    }
}
public class SuperKeyword{
    public static void main(String[] args) {
        SuperExample2 s1=new SuperExample2();
        s1.display();
    }
}