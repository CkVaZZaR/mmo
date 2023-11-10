public class Game {
    public static int countOfUnits;
    public String name;
    public Player[] players = new Player[2];
    public int massiveIndex = 0;
    public int config;

    public void setConfig(int config) {
        this.config = config;
    }
    public void addPlayer(String name) {
        players[massiveIndex] = new Player(name);
        ++massiveIndex;
    }
    public Game(String name) {
        this.name = name;
    }
}
