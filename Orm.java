package sprint1;

import javax.swing.JOptionPane;

public class Orm extends Djur {
    private static final double ORMMAT=20;
    public Orm(String namn,double vikt) {
        super(namn,vikt);
    }
    public double hurMycketMat(){
        return ORMMAT;
    }
        @Override
    public void printMåltid() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en orm som väger " + (int) getVikt() + "kg, den behöver " + hurMycketMat() +"g ormpellets");
    }
}