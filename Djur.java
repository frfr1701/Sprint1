package sprint1;

abstract public class Djur implements IDjurVikt{

    protected double vikt;
    protected String namn;

    public Djur(String namn, double vikt) {
        this.vikt = vikt;
        this.namn = namn;
    }

    @Override
    public double getVikt() {
        return vikt;
    }

    @Override
    public String getNamn() {
        return namn;
    }
    abstract void printMåltid();
}

