
public class Secondarydtype{
    public static void main(String[] args){
    String name = "Surya";
    String username = "Surya";
    System.out.println("name==username: " + (name==username));
    String name1 = new String("Surya");
    System.out.println("name==name1: " + (name==name1));
    System.out.println("name.equals(name1): " + name.equals(name1));
    }
}