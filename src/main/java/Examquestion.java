import java.util.Random;

public class Examquestion {

    private int number;
    private char grade;


    public void generateRandomGrade(){
        char[] possibleGrades = {'A','B','C','D','E','F'};
        Random r = new Random();
        int randomIndex = r.nextInt(possibleGrades.length);
        grade = possibleGrades[randomIndex];
    }


}
