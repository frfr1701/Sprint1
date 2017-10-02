package sprint1;

import javax.swing.JOptionPane;

public class Orm extends Djur {

    public Orm(String namn, double vikt) {
        super(namn, vikt);
    }

    @Override
    public double hurMycketMat() {
        return 20;
    }

    @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en orm som väger " + (int) getVikt() + "kg, den behöver " + hurMycketMat() + "g ormpellets");
    }
}
