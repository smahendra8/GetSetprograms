package Javafiles;



public class Typecasting {
    public static void main (String[]args){
        //implicit
    int a=25;
    double d=a;
        System.out.println(d);


    float f=10.5f;
        System.out.println(f);


    long l=1000;
        System.out.println(l);


    char c='a';
        System.out.println(c);


    String s1="a";
        System.out.println(s1);


    int a1=c;
        System.out.println(a1);


    double d1=45.5;
    double d2=a+d1;
        System.out.println(d2);


    int a2=c+10;
        System.out.println(a2);



    float f6=l%f;
        System.out.println(f6);


        short v=111;
    int a3=a-v;
        System.out.println(a3);


    double d3=f*d;
        System.out.println(d3);




    //explicit//
    float f2= (float) (f+d);
        System.out.println(f2);


    double d4=35.7;
        System.out.println(d4);


    int a4=(int)d4;
        System.out.println(a4);


   // a*= (int) d1;
        int a7= (int)d1*a;
        System.out.println(a7);


    double d5=(double)a4;
        System.out.println(d5);


    long l2=(long)d1;
        System.out.println(l2);


    float f5=(float)l2;
        System.out.println(f5);


    short v2=(short) l2;
        System.out.println(v2);


    float f4=(float) d4;
        System.out.println(f4);

    char c2='2';
        System.out.println(c2);


    short b3=(short)a4;
        System.out.println(b3);


    String s3="123456";
    double d7 = Double.parseDouble(s3);
        System.out.println(d7);


    String s4=s3;

        System.out.println(s4);


     int a5=(int)3;
        System.out.println(a5);


     double d6=(double)6;

        System.out.println(d6);

        short b2=(short)d5;
        System.out.println(b2);














    }
}
