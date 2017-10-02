package sprint1;

import java.util.ArrayList;
import java.util.List;

public class Databas {
    private final Djur Sixten = new Hund("Sixten",5);
    private final Djur Dogge = new Hund("Dogge",10);
    private final Djur Venus = new Katt("Venus",5);
    private final Djur Ove = new Katt("Ove",3);
    private final Djur Hypno = new Orm("Hypno",1);   
    
    public List<Djur> getAllDjur(){
        List<Djur> allaDjur = new ArrayList<>();
        allaDjur.add(Sixten);
        allaDjur.add(Dogge);
        allaDjur.add(Venus);
        allaDjur.add(Ove);
        allaDjur.add(Hypno);
        return allaDjur;
    }
}
