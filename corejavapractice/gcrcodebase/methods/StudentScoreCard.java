package gcrcodebase.methods;

import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; // P, C, M

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); // 2-digit marks
            }
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3]; // total, avg, %

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to find grade
    public static String findGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            String grade = findGrade(result[i][2]);

            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);

        displayScoreCard(pcmScores, results);
    }
}
