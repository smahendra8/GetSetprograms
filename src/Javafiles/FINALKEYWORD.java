package Javafiles;




 /*   public static final int MY_CONSTANT = 20;
    public final int Mc2 = 10;
    int a = 15;
    final int a1 = 3;
    static int a2 = 11;*/


     /*   //  a = 50;
        // a2 = 110;
        a1 = 30;
        MY_CONSTANT = 2000;
        Mc2 = 100;
    }

    void print(final int a2, int b) {
        a2 = 10;
        b = 20;
        System.out.println("A is" + a2 + "B is" + b);
        FINALKEYWORD fk = new FINALKEYWORD();
        fk.print(10, 25);*/


        public class FINALKEYWORD {
            FINALKEYWORD(){

                System.out.println("A constructor");
            }
            public static void main(String[] args) {
            {

                System.out.println("Initializer Block");
                int a=10;
                int b=20;
                System.out.println("sum is"+(a+b));
            }

        }
    }

