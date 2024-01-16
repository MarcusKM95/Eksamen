import java.util.ArrayList;
import java.util.List;

public class Motherboard {

    private List<SataDrive> connnectedSataDrives;

    public Motherboard(){
        this.connnectedSataDrives = new ArrayList<>();
    }

    public void connectSataDrives(SataDrive drive){
        if (connnectedSataDrives.size() < 4){
            connnectedSataDrives.add(drive);
            System.out.println("Satadrive successfully added to motherboard");
        }
        else {
            System.out.println("There's not enough space for another satadrive");
        }

    }
    public void listConnectedSatadrives(){
        System.out.println("Connected satadrives: ");
        for (SataDrive drive : connnectedSataDrives){
            System.out.println(drive);
        }
    }


}
