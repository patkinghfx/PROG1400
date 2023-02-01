public class Player {

    String playerName;
    int playerGoals;
    int playerAssists;
    String playerTeam;

    Player[] teamRoster;

    //Constructor
    public Player(String playerName, int playerGoals, int playerAssists, String playerTeam){
        this.playerName = playerName;
        this.playerGoals = playerGoals;
        this.playerAssists = playerAssists;
        this.playerTeam = playerTeam;
    }

    public Player(){
    }
    // Output all player details
    public void outputPlayerDetails() {
            System.out.println(this.playerTeam);
            System.out.println(this.playerName + ":    G - " + this.playerGoals + "    A - " + this.playerAssists + "      Total - " + (this.playerGoals + this.playerAssists));
        }

    //region Getters & Setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumGoals() {
        return playerGoals;
    }

    public void setNumGoals(int numGoals) {
        this.playerGoals = numGoals;
    }

    public int getNumAssists() {
        return playerAssists;
    }

    public void setNumAssists(int numAssists) {
        this.playerAssists = numAssists;
    }

    public String getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        this.playerTeam = playerTeam;
    }
    //endregion
}
