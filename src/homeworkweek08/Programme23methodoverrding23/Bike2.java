package homeworkweek08.Programme23methodoverrding23;

//creating a child class
public class Bike2 extends Vehical{
    //defining the same method as in trhe parent class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2();//creating object
        obj.run();//calling method
    }
}
