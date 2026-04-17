package Javafiles;

import java.util.*;
import java.util.function.Consumer;

public class DemoRandom {
    public static void main(String[] args) {
        new DemoRandom().samples();
    }

     void samples() {
        Random r= new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextFloat());
        System.out.println(r.nextDouble());
        System.out.println(r.nextLong());

         System.out.println("-----------forloop----------------------------");
        for (int i=0; i<10; i++) {
            System.out.println(r.nextInt());
        }

         System.out.println("===============random otp=============");
        for(int i=0; i<10; i++) {
            System.out.println(r.nextInt(100000, 999999));
        }
         System.out.println("===================names=======================");
        String []name=new String[]{"loki","sesi","kumar","ajay"};
        String [] reverse= new String[name.length];

         for (int j= 0; j <name.length ; j++) {
             reverse[j] = new StringBuilder(name[j]).reverse().toString();
             System.out.println(reverse[j]);
         }

         System.out.println("-------------------------random names------------------");
        for (int i=0;i<10;i++){
            System.out.println(name[new Random().nextInt(0,name.length)]);
        }



         System.out.println("---------------list of fruits-----------");
         List<String>sampleList= new LinkedList<>();
        sampleList.add("apple");
        sampleList.add("banana");
        sampleList.add("kiwi");
        sampleList.add("watermelon");



         for (int i = 0; i <= 10; i++) {
             String st= sampleList.get(r.nextInt(sampleList.size()));
            System.out.println(st);

             System.out.println(new Random().nextInt(sampleList.size()));

         }
        sampleList .forEach(st-> System.out.println(st));
         System.out.println("------------------------reverse order----------------------");

         Collections.reverse(sampleList);
         System.out.println(sampleList);
         }
    }




