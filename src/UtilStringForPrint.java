import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class UtilStringForPrint {
    protected static Scanner in = new Scanner(System.in);
    protected static Random random = new Random();
    public static void beginning(Game game) {
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
    public static String battle(Game game) {
        int round = 0;
        while (true) {
            ++round;
            for (int i = 0; i != Scenary.round.length; ++i) {
                if (Scenary.round[i].equals("soutroundnum")) {
                    System.out.print(round);
                } else {
                    System.out.print(Scenary.round[i]);
                }
            }
            System.out.print("\n");
            for (int j = 0; j != 3; ++j) {
                for (int i = 0; i != 2; ++i) {
                    for (int s = 0; s != Scenary.battle.length; ++s) {
                        for (int f = 0; f != 3; ++f) {
                            if (game.players[i].unit(f).health <= 0) {
                                game.players[i].deleteUnit(f);
                            }
                        }
                        int ti = 0;
                        for (int f = 0; f != 3; ++f) {
                            if (game.players[i].getUnit(f).equals("")) {
                                ++ti;
                            }
                        }
                        if (ti == 3) {
                            return game.players[(i + 1) % 2].getName();
                        }
                        if (!(game.players[i].getUnit(j).equals(""))) {
                            if (Scenary.battle[s].equals("phod")) {
                                System.out.print(game.players[i].getName());
                            } else if (Scenary.battle[s].equals("minwarr")) {
                                for (int y = 0; y != 3; ++y) {
                                    if (!(game.players[i].getUnit(y).equals(""))) {
                                        if (y == j) {
                                            System.out.print(" " + game.players[i].getUnit(y));
                                        } else {
                                            System.out.print(" " + game.players[i].getUnit(y).toLowerCase());
                                        }
                                    }
                                }
                            } else if (Scenary.battle[s].equals("mainwarr")) {
                                System.out.print(game.players[i].getUnitName(j));
                            } else if (Scenary.battle[s].equals("showprotwarr")) {
                                System.out.println(game.players[(i + 1) % 2]);
                            } else if (Scenary.battle[s].equals("hit")) {
                                int underint = in.nextInt() - 1;
                                Unit under = game.players[(i + 1) % 2].unit(underint);
                                int cri = CustomChanceRandom.getCrit(game.players[i].unit(j));
                                int hit = game.players[i].unit(j).power + cri;
                                boolean par = CustomChanceRandom.getParry(under);
                                if (par) {
                                    System.out.println(Scenary.parry[random.nextInt(Scenary.parry.length)]);
                                } else {
                                    if (hit > under.defence) {
                                        System.out.print(Scenary.hit[random.nextInt(Scenary.hit.length)]);
                                        game.players[i].unit(j).attack(under);
                                        if (cri > 0) {
                                            System.out.print(" " + Scenary.critical[random.nextInt(Scenary.critical.length)]);
                                            game.players[i].unit(j).attack(under);
                                        }
                                        if (under.health <= 0) {
                                            game.players[(i + 1) % 2].deleteUnit(underint);
                                        }
                                        System.out.print("\n");
                                        ti = 0;
                                        for (int f = 0; f != 3; ++f) {
                                            if (game.players[i].getUnit(f).equals("")) {
                                                ++ti;
                                            }
                                        }
                                        if (ti == 3) {
                                            return game.players[(i + 1) % 2].getName();
                                        }
                                    } else {
                                        System.out.println(Scenary.no_damage[random.nextInt(Scenary.no_damage.length)]);
                                    }
                                }
                            } else {
                                System.out.print(Scenary.battle[s]);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void ending(String name) {
        for (int i = 0; i != Scenary.ending.length; ++i) {
            if (Scenary.ending[i].equals("pname")) {
                System.out.print(name);
            } else {
                System.out.print(Scenary.ending[i]);
            }
        }
    }
}
