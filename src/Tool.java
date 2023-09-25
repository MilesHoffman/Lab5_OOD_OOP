public abstract class Tool {

    private double taxRate = 1.06;

    protected abstract double getMSRP();
    protected abstract  String getToolName();
    public abstract String getCategory();
    public abstract void setCategory(String category);

    protected double getTaxRate(){ return taxRate; }

    public double getPrice(){ return getMSRP() * getTaxRate(); }
}
