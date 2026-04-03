package Javafiles;

public class Threedimensional {
    public static void main(String[] args){
/*  int a1[][][]={
                {
                        {10, 11, 12},{13,14,15},{16,17,18},{19,20,21,}
                },
                {       {22,23,24},{25,26,27},{28,29,30},{31,32,33}
                },
                {       {34,35,36},{37,38,39},{40,41,42},{43,44,45}
                },
        };
        System.out.println(a1[1][2][1]);
        System.out.println(a1[2][1][1]);
        System.out.println(a1[0][1][2]);
        System.out.println(a1[0][2][1]);
        System.out.println(a1[1][2][2]);*/

        double [][][]d=new double[3][3][3];
        d[0][0][0]=12;
        d[0][1][0]=13;
        d[0][2][0]=14;
        d[1][0][0]=15;
        d[1][1][0]=16;
        d[1][2][0]=19;
        d[1][0][1]=20;
        d[1][2][0]=21;
        d[1][0][1]=23;
        d[1][0][2]=24;
        d[2][0][0]=25;
        d[2][1][0]=26;
        d[2][2][0]=27;
        d[2][0][1]=28;
        d[2][0][2]=29;
        System.out.println(d[2][0][2]);










}
}




