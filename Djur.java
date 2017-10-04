package sprint1;

abstract public class Djur implements IDjurVikt {

    protected double vikt;
    protected String namn;

    public Djur(String namn, double vikt) {
        this.vikt = vikt;
        this.namn = namn;
    }
    //dynamisk bindning till subklasserna när jag anropar getVikt därifrån.
    @Override
    public double getVikt() {
        return vikt;
    }
    //dynamisk bindning till subklasserna när jag anropar getNamn därifrån.
    @Override
    public String getNamn() {
        return namn;
    }
}
