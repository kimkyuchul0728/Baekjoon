import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> gradeEx = new HashMap<>();
        gradeEx.put("A+", 4.5);
        gradeEx.put("A0", 4.0);
        gradeEx.put("B+", 3.5);
        gradeEx.put("B0", 3.0);
        gradeEx.put("C+", 2.5);
        gradeEx.put("C0", 2.0);
        gradeEx.put("D+", 1.5);
        gradeEx.put("D0", 1.0);
        gradeEx.put("F", 0.0);
        double gradeScore = 0;
        double allScore = 0;
        for (int i = 0 ; i < 20 ; i++) {
            String object = scanner.next();
            double score = scanner.nextDouble();
            String grade = scanner.next();
            if (grade.equals("P")) {
                
            } else {
                gradeScore += score * gradeEx.get(grade);
                allScore += score;
            }
        }
        System.out.println(gradeScore / allScore );
    }
}