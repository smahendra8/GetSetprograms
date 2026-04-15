package Javafiles;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");

        System.out.println(fruits);
        System.out.println("fruits names" + fruits.get(1));
        fruits.set(1, "guava");
        System.out.println(fruits);
        int a = fruits.size();
        System.out.println(a);

    }
}
        /*interface list<B> {
            B get(int index);

            void add(B s);

            void add(int index, B b);

            int size();
        }
            void add (B b){
                List value [List value.length]=B;
            }
            class ArrayList<B>implements List<B>{
                @Override
                B get(int index){}
                 .add(1,1.5);
                int size();
               public void add(B b){
                    List
interface Shape{

             void draw();
         }
      //  class Circle implements Shape{

            public void draw() {
                System.out.println("drawing a circle");
            }}
                class rectangle implements Shape {
                    public void draw() {

                        System.out.println("drawing a rectangle");
                    }
                }
                class main{
                 public static void main (String[]args) {
                        ArrayList<Shape> shapes =new ArrayList<>();
                        shapes.add(new Circle());
                        shapes.add(new rectangle());
                        for (Shape s : shapes){
                            s.draw();

                        }
                    }
                }*/
            

