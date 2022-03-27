package homeworkweek08;
//2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
// -Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
// Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.

import java.util.Scanner;
public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        boolean isFirstNumber = true;
        int min = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter the number :");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (isFirstNumber) {
                    min = number;
                    max = number;
                    isFirstNumber = false;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min :" + min + "max :" + max);
        scanner.close();
    }}

