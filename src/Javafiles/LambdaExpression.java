package Javafiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


    //   public static void main(String[] args) {

       /* interface A {
            void print();
        }

        interface B {
            void print(String s);
        }

        interface Add {
        int adlayer scratchlayer scratchlayer scratchlayer scratchlayer scratchdlayer scratch(int a, int b);

        }

        A a1 = () ->
                System.out.println("lambda expression");
        a1.print();
        B b1 = (n) ->
                System.out.println("parameter is" + n);
        b1.print("ral");
         Add add = (a, b) -> a + b;
        int r = add.add(10, 15);
        System.out.println("Result"+r);
    }*/

    interface FE<T> {
        void Traverse(T e);
    }

     class MyList<T> {
         List<T> list = new ArrayList();
         void add(T t) {
             list.add(t);
         }


         void ForEach(FE fe) {
             Iterator<T> itr = list.iterator();
             while (itr.hasNext()) {
               T S   = itr.next();
                 fe.Traverse(S);
             }
         }
     }

            class LambdaExpression {
                public static void main(String[] args) {
                    MyList<String> ml = new MyList();
                    ml.add(" kite");
                    FE<String> fe2 = new FE<String>() {
                        @Override
                        public void Traverse(String ml) {

                            System.out.println("  " + ml);
                            System.out.println(ml+"doctor");
                        }
                    };
                   fe2.Traverse("ram");
                   ml.ForEach(fe2);
                    }
                }





