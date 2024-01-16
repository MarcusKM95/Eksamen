import java.util.ArrayList;

public class Butik {

    private ArrayList<Cykel> lager = new ArrayList<>();

    public void tilføj(Cykel cykel){
        lager.add(cykel);
    }

    public ArrayList<Cykel> getLager() {
        return lager;
    }

    public int samletLagerBeholdning(){
        int totalpris = 0;
        for (Cykel cykel : lager){
            totalpris += cykel.getPris();
        }
        return totalpris;
    }
}
