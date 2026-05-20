package Javafiles;

public class Controlstatement {
    public static void main(String[] args) {
        int x=10;
        int a=12;
        if (x+a>20){
            System.out.println("mahendra");
        }
          else {
           System.out.println("true");
        }



      String s="king";
          if (s!="king"){
              System.out.println("s is not king");
          }
          else if (s=="tarunrockzz"){
              System.out.println("palasansdram");
          } else if (s!="rockzztrun") {
              System.out.println("s>tarun");
              
          }
        //if,else
     /* int a=5;
      boolean evennumber=a%2==0;
      boolean oddnumber=a%3==0;
      if (evennumber!=oddnumber){
          System.out.println("even number");
        }
else {
          System.out.println("odd number");
      }*/
        //else if
        if (!(102 >= 0)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        if (false) {
            System.out.println("b");
        } else if (!(10 % 2 == 0)) {
            System.out.println("c");
        } else {
            System.out.println("else");
        }
        //nested if
        if (true) if (5 + 2 == 0) {
            System.out.println("A");
        }
        if (3 < 10 ) {
            System.out.println("B");
        } else if ((4 * 5 == 0)) {
            System.out.println("c");
        }
        if (!(5 != 90)) {

        }
        if (15 < 10) {
        }
        if ((25 < 10)) {
        } else {
            System.out.println("ELSE");
        }
    }


}