package Module2.testJezelf;

public class Average_2_2 {
    public static void main(String[] args) {
        int[] studentenScores = {12, 8, 13, 18, 15, 6, 12};
        int grootte = studentenScores.length;
        int som = 0;
        for (int studentenScore : studentenScores) {
            som += studentenScore;
        }
        float average = (float) som/grootte ;
        System.out.println("De gemiddelde score is: " + average);
    }
}