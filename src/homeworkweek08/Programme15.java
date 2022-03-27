package homeworkweek08;
import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        int rows = sc.nextInt();
        //1st loop
        for (int i = 0; i <= rows - 1; i++) {
            //nested 2nd loop
            for (int j = 2 * (rows - i); j >= 0; j--) {

                System.out.print(" ");
            }
            //nested 3rd loop
            for (int j = 0; j <= i; j++) {
                System.out.print("*");//printing stars
            }
            //end line
            System.out.println();
        }
    }

}