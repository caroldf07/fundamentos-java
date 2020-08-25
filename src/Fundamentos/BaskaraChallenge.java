package Fundamentos;

import java.util.Scanner;

public class BaskaraChallenge {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = enter.nextInt();

        System.out.println("Enter the second number: ");
        int b = enter.nextInt();

        System.out.println("Enter the third number: ");
        int c = enter.nextInt();
        enter.close();

        int delta = (int) Math.pow(b,2) - 4*a*c;

        System.out.println("Delta is: "+delta);

    }
}
