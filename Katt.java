package sprint1;

import javax.swing.JOptionPane;

public class Katt extends Djur {

    private static final double KATTMATOMVANDLARE = (1000.0/150.0);

    public Katt(String namn, double vikt) {
        super(namn, vikt);
    }
    //polymorfism
    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en katt som väger " + (int) getVikt() + "kg, den behöver " + (int) (getVikt() * KATTMATOMVANDLARE) + "g kattfoder");
    }

}
