import java.util.ArrayList;

public class Worker {

    private String name;
    private Tool workerTool;
    private double budget, x, y;

    Worker(String name, double budget, double x, double y) {
        this.name = name;
        this.budget = budget;
        this.x = x;
        this.y = y;
    }

    public String getName() { return name;    }
    public double getX() { return x;    }

    public double getY() { return y;    }

    public double getBudget() {
        return budget;
    }

    public void addTool(Tool tool ){
        // ############################################################################
        workerTool = tool;
    }

    public Tool getWorkerTool() {
        return workerTool;
    }
}
