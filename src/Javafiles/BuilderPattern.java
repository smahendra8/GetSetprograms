package Javafiles;

class Student {
        String name;
        int age;

        static class Builder{
            Student s=new Student();
            Builder setName(String s1){
                s.name=s1;
                return this;
            }
            Builder setAge(int age){
                s.age=age;
                return this;
            }
            Student Build(){
                return s;
            }
        }
    }

public class BuilderPattern {
    public static void main(String[] args){

        Student s = new Student.Builder().setName("mahi").setAge(10).Build();
        Student s1 = new Student.Builder().setName("krishna").Build();
        Student s2 = new Student.Builder().Build();
        System.out.println(s.name + " " +s.age+ "  " +" is student....." );


    }
}



