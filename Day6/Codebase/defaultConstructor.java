public class defaultConstructor {
   int x;
    public defaultConstructor(int x){
        this.x=x;
        System.out.println("This is a default constructor");
    }
    public static void main(String[] args) {
        
              
          defaultConstructor obj = new defaultConstructor(10);
            System.out.println(obj.x);
    }
}