public class Talraekke {
    private int[] talrække = {5, 66, 12, 87, 66, 56, 89, 66};

    public int tælTal(int søgeTal){
        int antalForekomster = 0;

        for (int tal : talrække){
            if (tal == søgeTal) {
                antalForekomster++;
            }
        }
        return antalForekomster;

    }
    public double gennemsnit(){
        int sum = 0;
        for (int tal : talrække){
            sum += tal;
        }
        return (double) sum / talrække.length;
    }
public String toString(){
        double gennemsnitsværdi = gennemsnit();
        return String.valueOf(gennemsnitsværdi) + " Er gennemsnitsværdien af talrækken";
}
}
