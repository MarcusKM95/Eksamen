import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Tal tal = new Tal();
        Talraekke talrække = new Talraekke();


        /*Card card1 = new Card(7, "Spades");
        Card card2 = new Card(10, "Hearts");

        String result = card1.beats(card2);
        System.out.println(result);*/
        Trailer trailer1 = new Trailer(2000);
        //Car car1 = new Car(2500, trailer1);
        //System.out.println(car1.totalWeight());
        /*Names name1 = new Names("Marcus Keimer Mortensen ");
        Names name2 = new Names("Marcus Mortensen");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1.toString());
        System.out.println(name2.toString());*/


        //DateAgeCalculator dateCalc = new DateAgeCalculator();
        //dateCalc.lowestAcceptable(28,25);

        /*Motherboard motherboard = new Motherboard();

        SataDrive sataDrive1 = new SataDrive("Satadrive 1");
        SataDrive sataDrive2 = new SataDrive("Satadrive 2");
        SataDrive sataDrive3 = new SataDrive("Satadrive 3");
        SataDrive sataDrive4 = new SataDrive("Satadrive 4");
        SataDrive sataDrive5 = new SataDrive("Satadrive 5");

        motherboard.connectSataDrives(sataDrive1);
        motherboard.connectSataDrives(sataDrive2);
        motherboard.connectSataDrives(sataDrive3);
        motherboard.connectSataDrives(sataDrive4);
        motherboard.connectSataDrives(sataDrive5);

        motherboard.listConnectedSatadrives();*/

        ArrayList<HogwartsStudent> students = new ArrayList<>();

        students.add(new HogwartsStudent("Carl", "Carlsen", "Gryffindor"));
        students.add(new HogwartsStudent("John", "Johnsen", "Slytherin"));
        students.add(new HogwartsStudent("Adam", "Adamsen", "Ravenclaw"));
        students.add(new HogwartsStudent("Frank", "Franksen", "Hufflepuff"));
        students.add(new HogwartsStudent("Åse", "Åsesen", "Humle"));
        Collections.sort(students);
        for (HogwartsStudent student : students){
            System.out.println("name: " + student.getFirstName() + "Last name: " + student.getLastName() + "house: " + student.getHouse());
        }


        /*Julegave julegave = new Julegave();

        if ((julegave.couldBeLego()))   {
            System.out.println("Dette kunne være lego");
        }
        else {
            System.out.println("Dette er nok ikke lego");
        }*/

        /*Image image = new Image("KEA.jpg", 44,10);

        System.out.println(image.isKnownFileType());
        System.out.println(image.isLandScape());
        System.out.println(image.isPortrait());*/




        //talrække.tælTal(66);
        //System.out.println(talrække.tælTal(56));
        //System.out.println(talrække.toString());

        //Cykel cykel = new Cykel("Kildemoes", "Rød", 4999);
        //Cykel cykel1 = new Cykel ("Scott", "Grøn", 11999);
        //Butik minButik = new Butik();

        //minButik.tilføj(cykel);
        //minButik.tilføj(cykel1);

        //System.out.println(dice.se());

        //System.out.println(minButik.getLager());
        //System.out.println(minButik.samletLagerBeholdning());
        //tal.tilføjTilListe();
        //System.out.println(tal.tilfældigtTal());
        //System.out.println(tal.toString());
    }
}
