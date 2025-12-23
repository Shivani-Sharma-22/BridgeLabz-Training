package gcrcodebase.strings;

import java.util.*;
public class RockPaperScisssor {
	 // Method to get computer choice
    static String computerChoice() {

        int num = (int) (Math.random() * 3);

        if (num == 0)
            return "rock";
        else if (num == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to find winner
    static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if (user.equals("rock") && computer.equals("scissors"))
            return "User";
        if (user.equals("paper") && computer.equals("rock"))
            return "User";
        if (user.equals("scissors") && computer.equals("paper"))
            return "User";

        return "Computer";
    }

    // Method to calculate statistics
    static String[][] calculateStats(int userWin, int compWin, int games) {

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = String.valueOf((userWin * 100) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWin);
        stats[1][2] = String.valueOf((compWin * 100) / games);

        return stats;
    }

    // Method to display result
    static void display(String[][] stats) {

        System.out.println("\nPlayer\tWins\tWin %");
        System.out.println("------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWin = 0;
        int compWin = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();

            String computer = computerChoice();
            String winner = findWinner(user, computer);

            System.out.println("Computer choice: " + computer);
            System.out.println("Winner: " + winner);

            if (winner.equals("User"))
                userWin++;
            else if (winner.equals("Computer"))
                compWin++;
        }

        String[][] stats = calculateStats(userWin, compWin, games);
        display(stats);

        sc.close();
    }
}
