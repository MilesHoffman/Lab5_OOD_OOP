import java.lang.Math;

public abstract class M_Tool extends Tool {

    private static String category = "TOOL";

    public double measure( Wall wall, double x, double y ){
        //#######################################################################
        double result = Math.sqrt(Math.pow(wall.getX() - x, 2) + Math.pow(wall.getY() - y, 2));
        return result;
    }

    public void setCategory(String category) {
        M_Tool.category = category;
    }

    public String getCategory() {
        return category;
    }
}
