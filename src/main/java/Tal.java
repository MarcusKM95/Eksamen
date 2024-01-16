import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tal {


    public Random random = new Random();
    private int[] liste = new int[10];

    public int[] getListe(){
        return liste;
    }

    public int tilfældigtTal(){
        return random.nextInt(5)+1;
    }

    public void tilføjTilListe(){
        for (int i = 0; i < liste.length; i++){
        liste[i] = tilfældigtTal();
        }

    }

    @Override
    public String toString() {
        return "Tal{" +
                "random=" + random +
                ", liste=" + Arrays.toString(liste) +
                '}';
    }
}

