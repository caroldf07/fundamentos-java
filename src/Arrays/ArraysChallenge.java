package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the quantity of grades: ");
        int index = scan.nextInt();

        int[] grades = new int[index];

        for(int i = 0; i < index; i++){
            System.out.print("Enter the grade: ");
            grades[i] = scan.nextInt();
        }
        int total = 0;
        for (int grade:
             grades) {
            total += grade;
        }
        System.out.println(Arrays.toString(grades));
        System.out.println(total/index);
    }
}
