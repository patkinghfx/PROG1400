import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("==================================");

        // Create an Array to store the Team Info
        Team[] myTeams = new Team[3];
        Scanner scanner = new Scanner(System.in);

        // Loop to enter team Info
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name for Team #" + (i + 1));
            System.out.print("(Minimum three characters)");
            myTeams[i] = new Team();
            myTeams[i].setTeamName(scanner.nextLine());
            myTeams[i].setTeamBudget();
        }

        //Loop to enter the players on each team and store in a Player array
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter Player Information for " + myTeams[j].getTeamName());
            System.out.println("(Goals & Assists must be zero or greater)");
            System.out.println("===========================");
            Player[] teamRoster = new Player[3];
            for (int k = 0; k < 3; k++) {
                teamRoster[k] = new Player();
                System.out.println("Enter Player Name: ");
                teamRoster[k].setPlayerName(scanner.nextLine());
                System.out.println("Enter Total # of Goals: ");
                teamRoster[k].setNumGoals(scanner.nextInt());
                System.out.println("Enter Total # of Assists: ");
                teamRoster[k].setNumAssists(scanner.nextInt());
                teamRoster[k].setPlayerTeam(myTeams[j].getTeamName());
                scanner.nextLine();
            }
            // Set the Player[] teamRoster for each team with the previous input
            myTeams[j].setTeamRoster(teamRoster);
        }
        // Output stats per team with random budget and rating
        System.out.println("REPORT: Stats per Team");
        System.out.println("======================");
        for (int l = 0; l < 3; l++) {
            System.out.println(myTeams[l].getTeamName() + ":    G - " + myTeams[l].totalGoals() + "    A - " + myTeams[l].totalAssists() + "    Total - " + (myTeams[l].totalGoals() + myTeams[l].totalAssists()));
            myTeams[l].outputTeamDetails();
        }

        //Output Stats per player
        System.out.println("REPORT: Stats per Player");
        System.out.println("======================");
        for (int m = 0; m < 3; m++) {
            Player[] teamPlayers;
            teamPlayers = myTeams[m].getTeamRoster();
            for (int n = 0; n < 3; n++) {
                teamPlayers[n].outputPlayerDetails();
            }
        }
    }
    }