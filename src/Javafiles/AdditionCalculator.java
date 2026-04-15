package Javafiles;

import java.util.Scanner;

public class AdditionCalculator {


    public void Calculator() {

            System.out.println("Enter numbers separting with *,+,- and press enter to mul,sum,sub");
            String input = new Scanner(System.in).nextLine();
            String[] inputs = input.split("\\*");
            String [] a=input.split("\\+");
            String [] s=input.split("-");

            // 1+2+2*3-5

            int mul = 0;
            int sum=0;
            int sub=0;
            for (int i = 0; i < inputs.length; i++) {
                mul *= Integer.parseInt(inputs[i]);
                if (inputs[i].contains("*")){

                } else if (inputs[i].contains("+")) {

                }
                char[] chars = inputs[i].toCharArray();
                char c = chars[1];
                if (c == '+') {

                }
            }for (int j=0;j<a.length;j++){
                sum += Integer.parseInt(a[j]);
        }for (int k=0;k<s.length;k++){
                sub -= Integer.parseInt(s[k]);
        }

            System.out.println("mul is " + mul+sum+sub);
        }
    }

