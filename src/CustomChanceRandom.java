import java.util.Random;

public class CustomChanceRandom {
    public static int getCrit(Unit unit) {
        Random random = new Random();
        float damage = unit.getCritChance();
        while (damage - (int) damage != 0) {
            damage *= 10;
        }
        if(random.nextInt((int) damage) == 1) {
            return unit.power;
        }
        return 0;
    }
    public static boolean getParry(Unit unit) {
        Random random = new Random();
        float parry = unit.getParryChance();
        if (parry == 0) {
            return false;
        }
        while (parry - (int) parry != 0) {
            parry *= 10;
        }
        if(random.nextInt((int) parry) == 1) {
            return true;
        }
        return false;
    }
}
