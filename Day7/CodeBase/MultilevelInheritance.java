public class MultilevelInheritance{
    public static void main(String[] args) {
        son son =new son();
        son.display();
        
    }
}

class grandfather{
    void display(){
        System.out.println("This is from class grandfather");
    }
}
class father extends grandfather{
    void display(){
        System.out.println("This is from class Father");
    }
}
class son extends father{
    void display(){
        System.out.println("This is from class Son");
    }
}
    
