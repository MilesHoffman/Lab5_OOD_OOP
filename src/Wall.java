public class Wall {

    private String color;
    private double x;
    private double y;

    Wall(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}
