package sprint1;

import java.util.List;
import javax.swing.JOptionPane;

public class Sprint1 {

    private List<Djur> allaDjur;

    private void go() {
        boolean exit = true;
        while (exit) {
            String val = JOptionPane.showInputDialog("Vilket djur ska få mat?").trim();
            if (val == null || val.equals("")) {
                System.exit(0);
            }
            for (Djur djur : allaDjur) {
                if (djur.getNamn().equalsIgnoreCase(val)) {
                    //polymorfism
                    djur.printMåltid();
                    exit = false;
                }
            }
            if (exit) {
                JOptionPane.showMessageDialog(null, "Djuret finns inte, försök igen!");
            }
        }
    }

    private void set() {
        Databas databas = new Databas();
        allaDjur = databas.getAllDjur();
        go();
    }

    public static void main(String[] args) {
        Sprint1 hotel = new Sprint1();
        hotel.set();
    }
}
