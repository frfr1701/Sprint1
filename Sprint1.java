package sprint1;

import java.util.List;
import javax.swing.JOptionPane;

public class Sprint1 {

    private List<Djur> allaDjur;

    private void program() {
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

    private void setDatabas() {
        Databas databas = new Databas();
        allaDjur = databas.getAllDjur();
        program();
    }

    public static void main(String[] args) {
        Sprint1 hotel = new Sprint1();
        hotel.setDatabas();
    }
}
