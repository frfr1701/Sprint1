package sprint1;

import java.util.List;
import javax.swing.JOptionPane;


public class Sprint1{
    public Sprint1(){
        Databas databas=new Databas();
        List<Djur> allaDjur= databas.getAllDjur();
        boolean exit=true;
        while(exit){
            String val = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if (val == null || val.equals("")){
                System.exit(0);
            }
            for (Djur djur : allaDjur) {
                if (djur.getNamn().equalsIgnoreCase(val)){
                    djur.printMåltid();
                    exit=false;
                }
            }
            if(exit)
                JOptionPane.showMessageDialog(null, "Djuret finns inte, försök igen!");
        }
    }
    
    public static void main(String[] args) {
       Sprint1 sprint1 = new Sprint1();
       System.exit(0);
    }
}