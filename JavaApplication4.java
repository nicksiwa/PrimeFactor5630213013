package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author NiseKoi
 */
public class JavaApplication4 {

    public static void main(String[] args) {
        double num = 0;
        
        System.out.println("---------- Prime Factor Program ----------");
        System.out.println("*** Press 0 to exit ");
        while (true) {
            
            System.out.println("");
            System.out.print("Enter Number : ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextDouble();
            

            System.out.print("Prime Factor of " + num + " is: ");

            for (int i = 2; i * i <= num; i++) {
                

                while (num % i == 0) {
                    System.out.print(i + " ");
                    num = num / i;
                }
            }

            if (num > 1) {
                System.out.println(num);
            } else {
                System.out.println();
            }

            if (num == 0) {
                break;
            }

        }

    }

}
