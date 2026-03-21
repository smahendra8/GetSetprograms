package Javafiles;



public class Typecasting {
    public static void main (String[]args){
        //implicit
    int a=25;
    double d=a;
    float f=10.5f;
    long l=1000;
    char c='a';
    String s1="a";
    int a1=c;
    double d1=45.5;
    double d2=a+d1;
    int a2=c+10;
    short v=111;
    float f6=l%f;
    int a3=a-v;
    double d3=f*d;
    //explicit//
    float f2= (float) (f+d);
    double d4=35.7;
    int a4=(int)d4;
    a*= (int) d1;
        int a7= (int)d1*a;
    double d5=(double)a4;
    long l2=(long)d1;
    float f5=(float)l2;
    short v2=(short) l2;
    float f4=(float) d4;
    char c2='2';
    short b3=(short)a4;
    String s3="123456";
    double d7 = Double.parseDouble(s3);
    String s4=s3;
     int a5=(int)3;
     double d6=(double)6;

       System.out.println(d);
        System.out.println(s1);
        System.out.println(f);
        System.out.println(l);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(a1);
        System.out.println(d2);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(d3);
        System.out.println(f2);
        System.out.println(d4);
        System.out.println(a4);
        System.out.println(c2);
        System.out.println(d6);
        System.out.println(a5);
        System.out.println(b3);
        System.out.println(d5);
        System.out.println(s4);
        System.out.println(l2);
        System.out.println(f5);
        System.out.println(v2);
        System.out.println(d7);
        System.out.println(f4);
    }
}
