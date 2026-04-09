package Javafiles;

import java.util.EnumMap;
import java.util.Map;


    enum Place {
        nellore, gudur, kavali
    }



    class Employee {
        String name, id;
        int age;
        Place place;

        Employee(String name, String id, int age, Place place) {

            this.name = name;
            this.id = id;
            this.age = age;
            this.place = place;
        }
    }
public class  ENUMMAP2 {
    public static void main(String[] args) {
        EnumMap<Place, Employee> em = new EnumMap<>(Place.class);
        em.put(Place.gudur, new Employee("siva", "s1", 30, Place.nellore));
        for (Map.Entry<Place, Employee> me : em.entrySet()) {
            Place p = me.getKey();
            Employee e = me.getValue();
            System.out.println("employee" + e.name + "from" + p.name());
            System.out.println("employee"+e.name+ e.id+ e.age+p.name());
            System.out.println(e.name);
            System.out.println(e.id);
            System.out.println(e.age);
            System.out.println(p.name());
            System.out.println("em");

        }
    }
}
