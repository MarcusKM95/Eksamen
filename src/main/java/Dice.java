import java.util.Random;
public class Dice {
    Random random = new Random();
    int dice2 = random.nextInt(6)+1;
    int dice1 = random.nextInt(6)+1;

    public int Ryst() {

        return dice1 + dice2 ;
    }
    public String se() {
        return "Du slog " + dice1 + " og " + dice2 + " og fik " + Ryst();
    }
}
