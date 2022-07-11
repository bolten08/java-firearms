package firearms.weapons;

import firearms.cartridge.Cartridge;
import firearms.firingmode.FiringModeEnum;
import firearms.magazine.Magazine;

import java.util.Objects;

public abstract class Weapon<T extends Magazine> {
    protected final Integer rateOfFire;
    protected final Integer rangeOfFire;
    protected T magazine;
    protected Cartridge chamber = null;
    protected boolean charged = false;
    protected FiringModeEnum firingMode = FiringModeEnum.SAFE;

    public Weapon(Integer rateOfFire, Integer rangeOfFire) {
        this.rateOfFire = rateOfFire;
        this.rangeOfFire = rangeOfFire;
    }

    protected void fire() {
        if (Objects.nonNull(chamber)) {
            System.out.println("[SOUND] ***Bang***");
            charged = true;
            chamber = magazine.feed();
        }
    }

    public abstract void addMagazine(T magazine);

    public void removeMagazine() {
        this.magazine = null;
    }

    public void pullChargingHandle() {
        System.out.println("[Action] Pulling the charging handle...");
        charged = true;
        if (Objects.nonNull(magazine)) {
            chamber = magazine.feed();
        } else {
            System.out.println("[Oh no] Need to add magazine!");
        }
    }

    public void pullTheTrigger() {
        System.out.println("[Action] Pulling the trigger...");

        if (firingMode == FiringModeEnum.SAFE) {
            System.out.println("[Oh no] Can't fire! Mode is Safe!");
        } else if (!charged) {
            System.out.println("[Oh no] Can't fire! Weapon is not charged!");
        } else {
            charged = false;
            System.out.println("[SOUND] Click...Hammer dropped");
            switch (firingMode) {
                case AUTO: {
                    fire();
                    fire();
                    fire();
                    break;
                }
                case SINGLE: {
                    fire();
                    break;
                }
            }
        }
    }

    public void inspectRounds() {
        System.out.println("[STATUS] You have " + magazine.getRounds() + " rounds in the magazine");
    }

    public Integer getRounds() {
        if (Objects.nonNull(magazine)) {
            Integer rounds = magazine.getRounds();
            if (Objects.nonNull(chamber)) {
                rounds += 1;
            }
            return rounds;
        } else {
            System.out.println("Where is my magazine?");
            return 0;
        }
    }

    public void inspectChamber() {
        if (Objects.nonNull(chamber)) {
            System.out.println("[STATUS] You have the round in the chamber");
        } else {
            System.out.println("[STATUS] The chamber is empty");
        }
    }

    public void inspectCharged() {
        if (charged) {
            System.out.println("[STATUS] Weapon is charged");
        } else {
            System.out.println("[STATUS] Weapon is not charged");
        }
    }

    public void inspectFireMode() {
        System.out.println("[STATUS] Weapon in the " + firingMode + " fire mode");
    }

    public Integer getRateOfFire() {
        return rateOfFire;
    }

    public Integer getRangeOfFire() {
        return rangeOfFire;
    }
}
