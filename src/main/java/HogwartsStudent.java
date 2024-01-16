public class HogwartsStudent implements Comparable<HogwartsStudent> {

    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house){
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house){
        if (isValidHouse(house)){
            this.house = house;
        }
        else {
            throw new IllegalArgumentException("This is not a house, only Gryffindor, Hufflepuff, Ravenclaw or Slytherin is a valid house");
        }
    }

    public boolean isValidHouse(String house){
        String[] allowedHouses = {"Gryffindor","Hufflepuff","Ravenclaw","Slytherin"};
        for (String allowedHouse : allowedHouses){
            if (allowedHouse.equalsIgnoreCase(house)){
                return true;
            }
            }

        return false;
    }

    @Override
    public int compareTo(HogwartsStudent o) {
        return this.lastName.compareToIgnoreCase(o.getLastName());
    }
}
