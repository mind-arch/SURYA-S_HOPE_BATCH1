public class  SimpleInheritance {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car= new Car();
        Car car1 = new Bike();
        car.indicator();
        bike.indicator();
        bike.honk();
            car1.indicator();
        
    }
}
class Car{
    void indicator() {
        System.out.println("This Car has an indicator.");
    }
}


class Bike extends Car{ 
    void indicator() {
        System.out.println("This bike has an indicator.");
    }
    void honk() {
        System.out.println("This bike honks.");
    }
}


