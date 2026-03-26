package Javafiles;

public class InheritanceSingle {
   // public static void main(String[] args){
  /* class vehicle {
        String name;
        int fuel;
    }
     class Audi extends vehicle {
       void hello(){
           System.out.println("hello");
       }
    }
    class thar extends vehicle {
       void flight(){
           System.out.println("flight");
       }
    }

            Audi a = new Audi();
            a.name = "audi";
            a.fuel = 12;
            thar b = new thar();
            b.name = "thar";
            b.fuel = 13;
            System.out.println(a.name + "fuel is" + a.fuel);
            System.out.println(b.name + "fuel is" + b.fuel);
           vehicle v = new Audi();
            vehicle v2 = new thar();
           Audi a2 = (Audi) v;
            a2.hello();
            thar b1=(thar) v2;
            b1.flight();*/




      static class n {
            int multiply(int a, double d) {
                return  (int) d*a;
            }
        }
        static class a extends n {
            int result = 5;

            void add(float f) {
                result = multiply(result, f);
            }

            void showResult() {
                System.out.println("result is"  +    result);
            }
        }
            public static void main(String[] args) {
                a a = new a();
                a.add(5.1f);
                a.showResult ();
            }
        }



