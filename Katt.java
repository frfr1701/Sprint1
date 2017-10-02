package sprint1;

import javax.swing.JOptionPane;

public class Katt extends Djur {

    private static final double KATTMAT = 1000 / 150;

    public Katt(String namn, double vikt) {
        super(namn, vikt);
    }

    @Override
    public double hurMycketMat() {
        return getVikt() * KATTMAT;
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en katt som väger " + (int) getVikt() + "kg, den behöver " + (int) hurMycketMat() + "g kattfoder");
    }

}
