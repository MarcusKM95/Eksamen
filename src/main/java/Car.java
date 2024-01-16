public class Car {
    private int weight;
    public Trailer trailer = new Trailer(getWeight());

    public int getWeight(){
        return weight;
    }

    public Car(int weight, Trailer trailer){
        this.weight = weight;
        this.trailer = trailer;

    }
    public int totalWeight(){
        try {
            int combinedWeight = getWeight() + trailer.getWeight();

            if (combinedWeight > 3500) {
                throw new IllegalArgumentException("Too much weight");

            }
            return combinedWeight;
        }
        catch (IllegalArgumentException e) {
            System.err.println("Too much weight");
        }
        return -1;
    }
}
