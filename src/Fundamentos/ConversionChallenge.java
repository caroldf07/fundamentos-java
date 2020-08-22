package Fundamentos;

import java.util.Scanner;

public class ConversionChallenge {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the first salary value: ");
        String salary1 = enter.nextLine().replace(",",".");

        System.out.print("Enter the second salary value: ");
        String salary2 = enter.nextLine().replace(",",".");

        System.out.print("Enter the third salary value: ");
        String salary3 = enter.nextLine().replace(",",".");

        double salary1Ok = Double.parseDouble(salary1);
        double salary2Ok = Double.parseDouble(salary2);
        double salary3Ok = Double.parseDouble(salary3);

        double average = (salary1Ok+salary2Ok+salary3Ok)/3;
        System.out.printf("Your average salary is: %2f",average);

    }


}
