package Javafiles;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static Javafiles.MYAnnotationType.TestA;


enum MYAnnotationType{
        TestA,TestB,TestC,TestD,None

    }
    @Retention(RetentionPolicy.RUNTIME)
    @interface WeAnnotation{


        String Test();
        String TestA() default "TestA";
        int num() default 10;
        String[] TestB() default {"A","B","C","D"};
        MYAnnotationType type() default TestA;
    }
    @interface MyAnnotation2{}
    class A{
        @WeAnnotation(Test="Sample MYAnnotation")
        void test(){
            System.out.println("MyAnnotationTest");
        }
    }
public class DemoAnnotation {
        public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
            Object o=new A();
            Class c=o.getClass();
            for (Method m:c.getDeclaredMethods()){
                if (m.isAnnotationPresent(WeAnnotation.class)){
                WeAnnotation ma=m.getAnnotation(WeAnnotation.class);
                String s1= ma.Test();
                    System.out.println(ma.Test());
                    System.out.println(ma.num());
                    String[] s2=ma.TestB();
                    System.out.println(Arrays.toString(s2));
                    m.invoke(o);
                    switch (ma.type()) {
                        case TestA->{
                            System.out.println("to fund null"+MYAnnotationType.None);

                            break;}
                       case None -> {
                           System.out.println("welcome");

                           break;
                       }
                        case TestB ->{
                            System.out.println("CustomAnnotation program");
                        }
                        }
                    }

            }
        }
    }

