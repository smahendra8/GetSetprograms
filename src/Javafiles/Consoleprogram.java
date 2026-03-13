package Javafiles;

import java.io.Console;

public class Consoleprogram {
    public static void main(String[] args) {
        Console cp=System.console();
        System.out.println("enter your name:");
        String st=cp.readLine();
        System.out.println("welcome to university"+st);




        Console csp=System.console();
        System.out.println("enter password:");
        char[]chs=csp.readPassword();
        String pass=String.valueOf(chs);
        System.out.println("password is:"+pass);


    }
}
