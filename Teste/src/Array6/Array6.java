package Array6;

import java.util.Scanner;

public class Array6 {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] numbers = new String[5];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}