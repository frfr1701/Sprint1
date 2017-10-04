package sprint1;

import javax.swing.JOptionPane;

public class Hund extends Djur {

    private static final double HUNDMATOMVANDLARE = 1000.0/100.0;

    public Hund(String namn, double vikt) {
        super(namn, vikt);

    }
    //polymorfism
    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en hund som väger " + (int) getVikt() + "kg, den behöver " + (int) (getVikt() * HUNDMATOMVANDLARE) + "g hundfoder");
    }
}
