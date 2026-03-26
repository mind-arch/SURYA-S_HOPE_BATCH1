public class HirerarchicalInheritance {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.display();
    }
}
class Parent {
    void display() {
        System.out.println("This is from class Parent");
    }
}
class Child1 extends Parent {
    void display() {
        System.out.println("This is from class Child1");
    }
}
class Child2 extends Parent {
    void display() {
        System.out.println("This is from class Child2");
    }
    
}