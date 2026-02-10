abstract class absEg {  //abstract class should be declared with abstract keyword

    abstract void start();  //no body, only declaration

    void fuel(){
        System.out.println("fuel");
    }
}

class Car extends absEg{
    void start(){
        System.out.println("car started");
    }
}
class Bike extends absEg{
    void start(){
        System.out.println("bike started");
    }
}

public class abstractExample {
    public static void main(String[] args) {
        absEg c = new Car();
        c.start();
        c.fuel();

        absEg b = new Bike();
        b.start();
        b.fuel();
    }
}

