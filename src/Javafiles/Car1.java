package Javafiles;

public class Car1{
    int fuel = 0;
    int mileage = 0;
    String name = " ";

    Car1(int fuel, int mileage, String name) {
        this.fuel = fuel;
        this.mileage = mileage;
        this.name = name;
    }

    int run() {

        return mileage * fuel;
    }

}



