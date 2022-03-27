package homeworkweek08;

public class Programme16Point {
    private int x;  // Instance Variable
    private int y; // Instance Variable
    //Constructors
    public Programme16Point (){
        //Default Values

    }
    public Programme16Point(int x, int y){
        this.x = x;
        this.y = y;

    }
    // Instance Method
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((0-this.getx()) * (0-this.getx())+ ((0-this.gety())* (0-this.gety())));
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.getx()) * (x-this.getx())+ ((y-this.gety())* (y-this.gety())));
    }
    public double distance (Programme16Point Second){
        return Math.sqrt((Second.getx()-this.getx()) * (Second.getx()-this.getx())+ ((Second.gety()-this.gety())* (Second.gety()-this.gety())));

    }
}
