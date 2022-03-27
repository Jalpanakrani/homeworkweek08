package homeworkweek08;

public class Programme20Cuboid extends Programme20Rectangle {
    private double height;

    public Programme20Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return (getArea() * height);
    }
}

