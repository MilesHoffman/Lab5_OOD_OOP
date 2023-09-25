public abstract class Tool {

    private double taxRate = 1.06;

    protected abstract double getMSRP();

    protected double getTaxRate(){ return taxRate; }

    public double getPrice(){ return getMSRP() * getTaxRate(); }
}
