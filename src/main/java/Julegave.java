import java.util.Random;

public class Julegave {

    private boolean isSoft;
    private boolean isRectangular;
    private boolean isRattling;

    private Random random = new Random();

    public Julegave(){
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.isRattling = random.nextBoolean();
    }

    public boolean couldBeLego(){
        if (!isSoft && isRectangular && isRattling){
            return true;
        }
        return false;
    }
}
