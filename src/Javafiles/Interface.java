package Javafiles;

public class Interface {
    public static void main(String args[]) {
        interface I {
            void print();

            int getValue();
        }
        class A implements I {
            int value = -1;

            @Override
            public void print() {
                System.out.println("A class print method");
            }

            @Override
            public int getValue() {
                return value;
            }
        }

        I a = new A();
        a.print();
        System.out.println("value is" + a.getValue());
        // System.out.println(a.Value);


        class B {

            I i;

            B(I i) {
                this.i = i;
            }

            void run() {
                System.out.println(i.getValue());
                i.print();
                B b = new B(a);
                b.run();





            }
        }
    }
    }







