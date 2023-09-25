
public class HardwareStore {


    private Tool[] tools = new Tool[] {new Spade(), new Mattock(), new TapeMeasurer(), new Ruler(), new Laser()};

    protected Tool pay( double budget ){

        int toolIndex = 0;
        double remainder = budget - tools[0].getPrice();

        for (int i = 0; i < tools.length; i++) {
            if (remainder < 0) {
                remainder = budget;
            }

            if (tools[i].getPrice() < budget && (budget - tools[i].getPrice()) < remainder) {
                toolIndex = i;
                remainder = budget - tools[i].getPrice();
            }
        }
        return tools[toolIndex];
    }

    public static void main(String[] args) {
        Worker John = new Worker("John", 45, 20, 25);
        Worker Louis = new Worker("Louis", 19, 20, 25);

        HardwareStore Builder = new HardwareStore();
        John.addTool(Builder.pay(John.getBudget()));
        Louis.addTool(Builder.pay(Louis.getBudget()));

        System.out.println("JOHN\n---------------");
        System.out.println(John.getName());
        System.out.println(John.getWorkerTool().getToolName());
        System.out.println(John.getWorkerTool().getCategory());

        System.out.println("\nCATEGORY CHANGED");
        John.getWorkerTool().setCategory("INSTRUMENT");
        System.out.println(John.getWorkerTool().getCategory());

        System.out.println("\nLOUIS\n---------------");
        System.out.println(Louis.getName());
        System.out.println(Louis.getWorkerTool().getToolName());
        System.out.println(Louis.getWorkerTool().getCategory());

        Wall wall = new Wall("gray", 12, 15);
        System.out.println(wall.getColor());

        System.out.println("\nJohn buys a Spade so he cannot measure. Louis is being used instead.");
        System.out.println(((M_Tool) Louis.getWorkerTool()).measure(wall, Louis.getX(), Louis.getY()));
    }
}
