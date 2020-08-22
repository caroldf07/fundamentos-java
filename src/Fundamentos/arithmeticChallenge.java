package Fundamentos;

import java.util.Scanner;

public class arithmeticChallenge {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = enter.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = enter.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = enter.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = enter.nextInt();

        System.out.print("Enter the fifth number: ");
        int num5 = enter.nextInt();

        System.out.print("Enter the sixth number: ");
        int num6 = enter.nextInt();

        int sum1 = num1 + num2;
        int sum2 = num3 - num4;
        int sum3 = num5 - num6;

        int mult1 = sum1 * 6;
        int mult2 = (sum2 * sum3)/2;

        int powerOf1 = (int) Math.pow(mult1,2);
        int powerOf2 = (int) Math.pow(mult2,2);

        int divison1 = powerOf1/6;
        int firstPart = divison1 - powerOf2;

        int firstPartFin = (int) Math.pow(firstPart,3);

        int finish = firstPartFin / (int) Math.pow(10,3);

        System.out.println(finish);


    }
}
