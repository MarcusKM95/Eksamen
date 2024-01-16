public class Names {

    private String firstname;
    private String middlename;
    private String lastname;

    public Names(String fullName){
        String[] nameParts = fullName.split( " ");
        firstname = nameParts[0];
        if (nameParts.length >= 2){
            lastname = nameParts[nameParts.length-1];

            if (nameParts.length == 3) {
                middlename = nameParts[1];

            }
        }
    }
    public String toString() {
        if (middlename != null) {
            return firstname + " " + middlename + " " + lastname;
        }
        return firstname + " " + lastname;
    }
}
