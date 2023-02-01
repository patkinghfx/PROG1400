import java.text.DecimalFormat;

import static java.lang.Double.parseDouble;

public class Team {

    String teamName;
    private double teamBudget;
    Player[] teamRoster;

    Player player;


    double minBudget = 0.00;
    double maxBudget = 100000.00;

    public Team() {
        this.teamName = teamName;
    }

    public Team(String teamName, double teamBudget) {
        this.teamName = teamName;
        this.teamBudget = teamBudget;
    }
    // Calculate a random budget between 0 - 100,000
    public double randomBudget() {
        double randomDouble = (Math.floor(Math.random() * (maxBudget - minBudget + 1) + minBudget));
        DecimalFormat decForm = new DecimalFormat("#.##");
        randomDouble = parseDouble(decForm.format(randomDouble));
        return randomDouble;
    }
    // Return total Assists for team roster
    public int totalAssists() {
        int totalAssists = 0;
        for (int k = 0; k < 3; k++) {
            getTeamRoster();
            player = this.teamRoster[k];
            totalAssists = totalAssists + player.getNumAssists();
        }
        return totalAssists;
    }
    // Return Total Goals for team Roster
    public int totalGoals() {
        int totalGoals = 0;
        for (int j = 0; j < 3; j++) {
            player = this.teamRoster[j];
            totalGoals = totalGoals + player.getNumGoals();
        }
        return totalGoals;
    }

        // Output for budget and star rating
        public void outputTeamDetails() {
            System.out.print("Budget - " + this.teamBudget);
            int teamTotals = (totalGoals() + totalAssists());
            if (teamTotals > 20) {
                System.out.println("     Rating: ***\n");
            } else if (teamTotals >= 10) {
                System.out.println("     Rating: **\n");
            } else if (teamTotals > 0) {
                System.out.println("     Rating: *\n");
            } else {
                System.out.println("     Rating: \n");
            }
        }

        //region Setters & Getters

        public String getTeamName () {
            return teamName;
        }

        public void setTeamName (String teamName){
            this.teamName = teamName;
        }

        public double getTeamBudget () {
            return teamBudget;
        }

        public void setTeamBudget () {
            this.teamBudget = randomBudget();
        }

        public Player[] getTeamRoster () {
            return teamRoster;
        }

        public void setTeamRoster (Player[] teamRoster) {
            this.teamRoster = teamRoster;
        }

        //endregion
    }
