package homeworkweek08;
//5.Palindrome Number
//        Write a method called isPalindrome with one int parameter called number.
//        The method needs to return a boolean.
//        It should return true if the number is a palindrome number otherwise it should return false.
//        Check the tips below for more info about palindromes.
//        Example Input/Output
//        isPalindrome(-1221); → should return true
//        isPalindrome(707); → should return true
//        isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
//        11212.

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        int palindrome = new Scanner(System.in).nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number :" + palindrome + "is a palindrome");
        } else {
            System.out.println(("Number :" + palindrome + "is not a palindrome"));
        }
    }
//java method to check number is palindrome or not
public static boolean isPalindrome (int number) {
    int palindrome = number;//copied number into variable
    int reverse = 0;
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

    //if original and the reverse of number is equal means
    //number is paliondrome in java
    if (number == reverse) {
        return true;
    }
    return false;
}
}