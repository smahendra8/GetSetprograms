package Javafiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ARRAYTYPE {
    int a[]=new int[20];
//int a2[]={1,2,3,4,5};
//int[] a1=new int[10];
//float []f1=new float[11];



    public void excuteoperators() {
       /* f1[0]=10.2f;
        f1[1]=12.5f;
        f1[2]=14.5f;
        f1[3]=16.5f;
        f1[4]=18.7f;
        f1[5]=20.5f;
        f1[6]=22.4f;
        f1[7]=24.6f;
        f1[8]=26.6f;
        f1[9]=30.00f;
        f1[10]=32.5f;
        float t2=f1[0];
        f1[0]=t2*5;
        f1[1]=f1[1]*5;
        f1[2]=f1[2]*2;
        f1[3]=f1[3]*5;
        f1[4]=f1[4]*2;
        f1[5]=f1[5]*2;
        f1[6]=f1[6]*5;
        f1[7]=f1[7]*2;
        f1[8]=f1[8]*2;
        f1[9]=f1[9]*2;
        f1[10]=f1[10]*2;
        System.out.println(f1[0]);
        System.out.println(f1[1]);
        System.out.println(f1[2]);
        System.out.println(f1[3]);
        System.out.println(f1[1]);
        System.out.println(f1[4]);
        System.out.println(f1[5]);
        System.out.println(f1[6]);*/
      //  int a3=a2[4];

        a [0]=10;
        a[1]=12;
        a[2]=14;
        a[3]=16;
        a[4]=18;
        a[5]=20;
        a[6]=22;
        a[7]=24;
        a[8]=26;
        a[9]=28;
        a[10]=30;
        a[11]=32;
        a[12]=34;
        a[13]=36;
        a[14]=38;
        a[15]=40;
        a[16]=42;
        a[17]=44;
        a[18]=46;
        a[19]=48;
        int t=a[0];
        a[0]=t*2;
        a[1]=a[1]*2;
        a[2]=a[2]*2;
        a[3]=a[3]*2;
        a[4]=a[4]*2;
        a[5]=a[5]*2;
        a[6]=a[6]*2;
        a[7]=a[7]*2;
        a[8]=a[8]*2;
        a[9]=a[9]*2;
        a[10]=a[10]*2;
        a[11]=a[11]*2;
        a[12]=a[12]*2;
        a[13]=a[13]*2;
        a[14]=a[14]*2;
        a[15]=a[15]*2;
        a[16]=a[16]*2;
        a[17]=a[17]*2;
        a[18]=a[18]*2;
        a[19]=a[19]*2;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
       // System.out.println(a3);
       } }
  class Main1{
      static   int arr[]={1,5,6,1,1111,46,150};
     static    int sum() {
         int sum = 0;
         for (int i = 0; i < arr.length; i++)
             sum += arr[i];
         return sum;
     }




      public static void main(String[] args) {
         /// /////revesed array//////////
        /*  int arr2[]={4,5,6,7,8,9,};
          for(int i=0;i<arr2.length/2;i++){
              int t=arr2[i];
              arr2[i]=arr2[arr2.length-i-1];
              arr2[arr2.length-i-1]=t;
          }*/
          String [] s=new String[]{"1","power","3","myclass","done"};
          String[] reverse =new String[s.length];


          for(int i=0;i<s.length;i++){
              reverse[i]= new StringBuilder(s[i]).reverse().toString();
              System.out.println(reverse[i]);
             // List<String> list=  Arrays.asList(s);
            //  Collections.reverse(list);
             // System.out.println(Arrays.toString(s));

          }
          for(String str:reverse)
              System.out.println(str);


        //  System.out.println(""+ Arrays.toString(arr2));

         // System.out.println(arr2[0]);
          System.out.println("the sum of the given array is:" + sum());

      }


  }


