package sprint1;

import javax.swing.JOptionPane;

public class Hund extends Djur {

    private static final double HUNDMAT = 1000 / 100;

    public Hund(String namn, double vikt) {
        super(namn, vikt);

    }

    @Override
    public double hurMycketMat() {
        return getVikt() * HUNDMAT;
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en hund som väger " + (int) getVikt() + "kg, den behöver " + (int) hurMycketMat() + "g hundfoder");
    }
}
