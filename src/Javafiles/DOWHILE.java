package Javafiles;

public class DOWHILE {
    public static void main(String[] args) {
        //infinite loop
       int a = 50;
        while (a < 60) {

            System.out.println("a is " + a);
            if (a == 55) {
                System.out.println("rju");

            } else a--;
            {
                System.out.println("done");
                break;
            }
        }

        float f = 0.5f;
        {
            while (f < 10) {
                System.out.println("f is " + f);
                if (f > 10) {
                    System.out.println("cat");
                    break;
                } else f++;
                {
                    System.out.println("load");
                }
            }
        }


        //do while
        int s = 12;
        do {
            System.out.println("one");
            System.out.println("do the action" + s);
            if ((s <45)) {
                System.out.println(s);
            } else s--;
            {
                System.out.println("water");
            }
            while (s!=46)
            {
                System.out.println("tea");
                 break;
            }
            while (s<=45)
            {
                System.out.println("77");
                break;
            }
        }while(false);{
            System.out.println("......000");
        }

        String p="hello";
        int x=15;
        do {
            System.out.println(x+"hello");
            if (p!="hello"){
                System.out.println(x+"morning");
            }else{
                System.out.println(x+"evening");
            }
            switch (x){
                case 1:
                    System.out.println("are you there");
                    break;
                case 2:
                    System.out.println("when are you coming");
                    break;
                case 3:
                    System.out.println("are you here");
                default:
                    System.out.println(14);
            }break;

        }while (x==15);
        {
            System.out.println("watching");
        }

       /* int s1=10;
        while(s1<15)s++;

        System.out.println(s);
        do
            System.out.println("Do");
         while (s1<=15);s++;
            System.out.println(s);*/







//nested while
int k=10;
 int y=100;
 while(k<=15){
     k++;
     while (y<500){
         y+=y;
         System.out.println("y is value"+y);
     }y-=500;
 }

        int num=10;
        while (num<20) {
            System.out.println(num);
            num += 4;

           if (num == 18) {

          }
        continue;
        }



    }
}