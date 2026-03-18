package Javafiles;



public class Abstraction {
    public static void main(String[] args) {

        abstract class Vehicle {
            String name;

            Vehicle(String name) {
                this.name = name;
            }

            abstract void start();

            void displayname() {
                System.out.println("Vehicle type:" + name);
            }
        }
        class Tata extends Vehicle {
            Tata(String name) {
                super(name);
            }

            @Override
            public void start() {

                System.out.println("car is driving on roads.");
            }

        }
        Tata tata = new Tata("amazon");
        tata.displayname();
        tata.start();
        System.out.println("luxury"+tata.name);


    }
}