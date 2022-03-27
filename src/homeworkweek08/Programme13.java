package homeworkweek08;

public class Programme13 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,99));
    }
    public static boolean hasSharedDigit(int Number1, int Number2) {

        if ((Number1 >= 10 && Number1 <= 99) && (Number2 >= 10 && Number2 <= 99)|| (Number1/10 == Number2/10)
                ||Number1%10 ==Number2 % 10 )  {
            return true;
        }
            return false;

    }
}