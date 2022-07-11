package firearms;

import firearms.weapons.Weapon;
import firearms.weapons.assault_rifles.AK74;
import firearms.weapons.handguns.Makarov;

import java.util.List;
import java.util.Random;

public class Rambo {
    private static final String[] QUOTES = {
            "Murdock... I'm Coming To Get You!",
            "Live For Nothing, Or Die For Something.",
            "They Drew First Blood.",
            "Nothing Is Over! Nothing! You Just Don't Turn It Off!",
            "You Know There’s More Men Out There. You Know Where They Are. Find ‘Em, Or I’ll Find You!",
            "Don’t Push It, Or I’ll Give You A War You Won’t Believe!"
    };
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private List<Weapon> weapons;

    public void takeGunBox(List<Weapon> weaponList) {
        this.weapons = weaponList;
    }

    public void killThemAll() {
        weapons.forEach(weapon -> {
            if (weapon instanceof AK74) {
                System.out.println(ANSI_GREEN + "Taking AK74 from weapon box!" + ANSI_RESET);
                ((AK74) weapon).switchAutomaticFire();
            }
            if (weapon instanceof Makarov) {
                System.out.println(ANSI_GREEN + "Taking Makarov from weapon box!" + ANSI_RESET);
                ((Makarov) weapon).switchSingleFire();
            }
            weapon.pullChargingHandle();
            getRandomQuote();
            while (weapon.getRounds() > 0) {
                weapon.pullTheTrigger();
            }
        });
    }

    private static void getRandomQuote() {
        int rnd = new Random().nextInt(QUOTES.length);
        System.out.println(ANSI_RED + QUOTES[rnd] + ANSI_RESET);
    }
}
