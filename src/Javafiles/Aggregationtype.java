package Javafiles;

class A2{
    String name;
    void print(){
        System.out.println("A class");
    }
}
class B2{
    void print(){
        System.out.println("B class");
    }
}

public class Aggregationtype {
    A2 a1,a2,a3;
    B2 b1,b2,b3;
    public static void main(String[] args){
        B2 b =new B2();
        C1 c=new C1();
        c.print();
    }
}
class C1{
    B2  b1=new B2();
    B2 b2;
    void print(){
        b1.print();
      //  b2.print();
    }

}
