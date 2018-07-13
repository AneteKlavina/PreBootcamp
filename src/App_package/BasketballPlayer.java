package App_package;

public class BasketballPlayer {
    public int points;
    public int rebounds;
    public int assists;
    public int steals;
    public int blocks;
    public int foulsDrawn;
    public int missedFieldGoals;
    public int missedFreeThrows;
    public int turnovers;
    public int shotsRejected;
    public int foulsCommitted;


    public void setPoints(int points) {
        this.points = points;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setSteals(int steals){
        this.steals = steals;
    }

    public void setBlocks(int blocks){
        this.blocks = blocks;
    }

    public void setFoulsDrawn(int foulsDrawn){
        this.foulsDrawn = foulsDrawn;
    }

    public void setMissedFieldGoals(int missedFieldGoals){
        this.missedFieldGoals = missedFieldGoals;
    }

    public void setMissedFreeThrows(int missedFreeThrows){
        this.missedFreeThrows = missedFreeThrows;
    }

    public void setTurnovers(int turnovers){
        this.turnovers = turnovers;
    }

    public void setShotsRejected(int shotsRejected){
        this.shotsRejected = shotsRejected;
    }

    public void setFoulsCommitted(int foulsCommitted){
        this.foulsCommitted = foulsCommitted;
    }






    public void points() {
        System.out.println(points);
    }

    public void rebounds() {
        System.out.println(rebounds);

    }

    public void assists() {
        System.out.println(assists);
    }

    public void steals() {

    }

    public void blocks() {

    }

    public void foulsDrawn() {

    }

    public void missedFieldGoals() {

    }

    public void missedFreeThrows() {

    }

    public void turnowers() {

    }

    public void shotsRejected() {

    }

    public void foulsCommitted() {

    }

    public int testFunction() {
        return (points + assists + rebounds + steals + blocks + foulsDrawn) - (missedFieldGoals + missedFreeThrows + turnovers + shotsRejected + foulsCommitted);
    }
}
