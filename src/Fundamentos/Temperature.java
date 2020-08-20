package Fundamentos;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter a temperature in ºF: ");
        Scanner scan = new Scanner(System.in);
        double temperatureF = scan.nextInt();

        final double CONST1 = 32;
        final double CONST2 = (5/9.0);
        double temperatureC = (temperatureF - CONST1) * CONST2;
        System.out.print("Temperature in Celsius is: "+temperatureC);
    }
}
