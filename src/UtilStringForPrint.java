import java.util.Scanner;

public class UtilStringForPrint {
    protected static Game game = new Game("MMO");
    protected static Scanner in = new Scanner(System.in);
    public static void beginning() {
        for (int i = 0; i != Scenary.beginning.length; ++i) {
            if (Scenary.beginning[i].equals("p1in")) {
                game.addPlayer(in.next());
            } else if (Scenary.beginning[i].equals("p2in")) {
                game.addPlayer(in.next());
            } else if (Scenary.beginning[i].equals("p1name")) {
                System.out.print(game.players[0].getName());
            } else if (Scenary.beginning[i].equals("heroes p1")) {
                for (int j = 0; j != 3; ++j) {
                    String line = in.next();
                    int type = 0;
                    if (line.equals("W")) {
                        type = 0;
                        line = "Маг";
                    } else if (line.equals("K")) {
                        type = 1;
                        line = "Рыцарь";
                    } else if (line.equals("T")) {
                        type = 2;
                        line = "Терминатор";
                    }
                    game.players[0].addUnit(type, line);
                }
            } else if (Scenary.beginning[i].equals("p2name")) {
                System.out.print(game.players[1].getName());
            } else if (Scenary.beginning[i].equals("heroes p2")) {
                for (int j = 0; j != 3; ++j) {
                    String line = in.next();
                    int type = 0;
                    if (line.equals("W")) {
                        type = 0;
                        line = "Маг";
                    } else if (line.equals("K")) {
                        type = 1;
                        line = "Рыцарь";
                    } else if (line.equals("T")) {
                        type = 2;
                        line = "Терминатор";
                    }
                    game.players[1].addUnit(type, line);
                }
            } else if (Scenary.beginning[i].equals("stcfg")) {
                game.setConfig(in.nextInt());
            } else {
                System.out.print(Scenary.beginning[i]);
            }
        }
    }
}
