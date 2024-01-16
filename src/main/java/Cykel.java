public class Cykel {
    private String mærke;
    private String farve;
    private int pris;

    public Cykel (String mærke, String farve, int pris){
        this.mærke = mærke;
        this.farve = farve;
        this.pris = pris;
    }
    public int getPris(){
        return pris;
    }

    @Override
    public String toString() {
        return "Cykel{" +
                "mærke='" + mærke + '\'' +
                ", farve='" + farve + '\'' +
                ", pris=" + pris +
                '}';
    }
}
