class Animal{
void display(){
    System.out.println("This is an animal.");
}
}
class Dog extends Animal
{
    void display(){
        System.out.println("This is a dog.");
    }
}
class Cat extends Animal
{
    void display(){
        System.out.println("This is a cat.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.display();
        a2.display();
    }
}
