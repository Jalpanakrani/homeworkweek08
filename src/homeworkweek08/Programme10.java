package homeworkweek08;
//10. Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;
public class Programme10 {
    public static void main(String[] args) {
        int no, ori, sum = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number=");
        no=sc.nextInt();
        ori=no;
        while(no>0)
        {
            sum=sum+(no%10)*(no%10)*(no%10);
            no=no/10;
        }
        if(ori==sum) {
            System.out.println("this is a armstrong no");
        }
        else
        {
            System.out.println("This is not armstrong no");
        }
    }
}

