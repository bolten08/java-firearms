package firearms.weapons.assault_rifles;


import firearms.firingmode.FiringModeEnum;
import firearms.firingmode.ThreePositionFiringMode;
import firearms.magazine.AKMagazine;
import firearms.weapons.Weapon;

public class AK74 extends Weapon<AKMagazine> implements ThreePositionFiringMode {
    public AK74() {
        super(600, 1000);
    }

    @Override
    public void switchAutomaticFire() {
        System.out.println("[Action] Switching firing mode to auto...");
        firingMode = FiringModeEnum.AUTO;
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

    public void addMagazine(AKMagazine magazine) {
        System.out.println("[Action] Adding " + magazine.getName() + " to AK74");
        this.magazine = magazine;
    }
}
