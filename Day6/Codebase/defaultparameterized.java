public class defaultparameterized {
    int x;
    public defaultparameterized(){
        this.x=10;
        System.out.println("This is a default constructor");
    }
    public defaultparameterized(int x){
        this.x=x;
        System.out.println("This is a parameterized constructor");
    }
    public static void main(String[] args) {
        defaultparameterized obj1 = new defaultparameterized();
        System.out.println(obj1.x);
        defaultparameterized obj2 = new defaultparameterized(20);
        System.out.println(obj2.x);
    }
}