public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public int getYourAge(){
        return yourAge;
    }
    public int getDateAge(){
        return dateAge;
    }

    public void lowestAcceptable(int yourAge, int dateAge){
        int myLowest = (yourAge/2)+7;
        if (dateAge<myLowest){
            System.out.println("your date is too young");
        } else if (dateAge==myLowest) {
            System.out.println("Your date's age is fine");

        }
        if (dateAge>myLowest) {
            System.out.println("your date's age is fine");
        }
    }
}
