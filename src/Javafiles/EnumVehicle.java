package Javafiles;
import java.util.*;

public class EnumVehicle {
   enum Vehicle{Car,Bus,Bike,Tractor}
    public static void main(String[] arg){
        Vehicle v=Vehicle.Bike;
        if(v==Vehicle.Car){
            System.out.println("car");
        } else if (v==Vehicle.Bus) {
            System.out.println("Bus");
        } else if (v==Vehicle.Tractor) {
            System.out.println("Tractor");
        } else if (v==Vehicle.Tractor) {
            System.out.println("bike");
        }else{
            System.out.println("unknown");
        }
        switch (v){
            case Vehicle.Car:
                System.out.println("car");
                break;
            case Vehicle.Bus:
                System.out.println("Bus");
                break;
            case Vehicle.Bike:
                System.out.println("bike");
                break;
            case Vehicle.Tractor:
                System.out.println("tractor");

        }

    }








}
