public class ConstructorOverloading {
    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(10);
        ConstructorOverloading c3 = new ConstructorOverloading(10, "Hello");

    }
    public ConstructorOverloading(){
        System.out.println("This is the default constructor");
    }
    public ConstructorOverloading(int a){
        System.out.println("This is the constructor with one parameter: "+a);
    }
    public ConstructorOverloading(int a, String b){
        System.out.println("This is the constructor with two parameters: "+a+" and "+b);
    }
}