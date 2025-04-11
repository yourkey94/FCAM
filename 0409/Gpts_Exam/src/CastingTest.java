class Car extends Vehicle{
    int length;
    int wheel;

    Car(){
        this(8, 4);
    }
    Car(int length, int wheel){
        super(10);
        this.length = length;
        this.wheel = wheel;
    }
}

class Animal extends Vehicle{
    int length;
    int leg;

    Animal(){
        this(5,4);
    }
    Animal(int length, int leg){
        super(5);
        this.length= length;
        this.leg=leg;
    }
}
class Vehicle{
    int speed;

    Vehicle(){
        this(30);
    }
    Vehicle(int speed){
        this.speed=speed;
    }
}

public class CastingTest {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        Car c= new Car();
        Animal a= new Animal();

        Car c1= new Car();
        Vehicle v2= new Vehicle();
        c1 = (Car)v2;

    }
}