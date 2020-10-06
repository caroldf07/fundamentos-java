package DIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class positiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = scan.nextInt();

        System.out.print("Input a number: ");
        int b = scan.nextInt();

        System.out.print("Input a number: ");
        int c = scan.nextInt();

        System.out.print("Input a number: ");
        int d = scan.nextInt();

        System.out.print("Input a number: ");
        int e = scan.nextInt();

        System.out.print("Input a number: ");
        int f = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
        numbers.add(f);

        int positive = 0;
        for (int number : numbers){
            if (number > 0){
                positive += 1;
            }
        }
        System.out.println(positive+" valores positivos");

        while (int ii = 0; ii < 2) {
            ii++;
            System.out.println("ii = " + ii);
        }
    }
}
