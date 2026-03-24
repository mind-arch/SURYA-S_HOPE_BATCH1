public class methods{
    int value = 10; 
    public void square(int n){
        System.out.println("The square of the value is: " + value*n*n);
    }
    public static void main(String[] args){
        methods m = new methods();
        String name = "John";
        System.out.println("The value of the local variable is: " + name);
        System.out.println("The value of the instance variable is: " + m.value);
        m.square(5);

    
    }
}