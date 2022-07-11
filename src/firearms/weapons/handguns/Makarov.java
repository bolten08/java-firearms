package firearms.weapons.handguns;

import firearms.firingmode.FiringModeEnum;
import firearms.firingmode.TwoPositionFiringMode;
import firearms.magazine.MakarovMagazine;
import firearms.weapons.Weapon;


public class Makarov extends Weapon<MakarovMagazine> implements TwoPositionFiringMode {

    public Makarov() {
        super(30, 50);
    }

    @Override
    public void switchSingleFire() {
        System.out.println("[Action] Switching firing mode to single...");
        firingMode = FiringModeEnum.SINGLE;
    }

    @Override
    public void switchSafe() {
        System.out.println("[Action] Switching firing mode to safe...");
        firingMode = FiringModeEnum.SAFE;
    }

    public void addMagazine(MakarovMagazine magazine) {
        System.out.println("[Action] Adding magazine to the weapon! " + magazine.getName());
        this.magazine = magazine;
    }
}
