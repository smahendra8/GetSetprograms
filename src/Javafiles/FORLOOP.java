package Javafiles;

public class FORLOOP {
    public static void main (String[]args){
       /* for (int i=1; i<5; i++){
            for (int j=1;  j<5; j++){
                for (int k=1; k<5; k++){
                    System.out.println("i:"+i+"j:"+j+"k:"+k);
                }
                }
            } */
        int []a={1,2,3,4,5};
        int []b=new int[10];
        int index=0;

        for (int i=0; index<a.length;i++){
            b[i]=a[i];
            System.out.println(a.length);
            System.out.println(b);
        }


    /*    for (int i=0; i<10; i++){
            System.out.println("i value is"+i);
            i +=i;
            if (i==5){
                i=7;
            }
            else {
                i++;
            }
            for (int j=0;j<15;j++){
                System.out.println("j value is"+j);
            }

        }*/
        }

    }


