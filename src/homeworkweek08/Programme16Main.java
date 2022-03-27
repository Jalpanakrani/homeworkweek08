package homeworkweek08;

public class Programme16Main {
    public static void main(String[] args) {
        Programme16Point first = new Programme16Point(6, 5);
        Programme16Point second = new Programme16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme16Point point = new Programme16Point();
        System.out.println("distance()= " + point.distance());
    }
}
