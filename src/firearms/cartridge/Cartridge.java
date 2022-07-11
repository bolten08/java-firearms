package firearms.cartridge;

public abstract class Cartridge {
    private String caliber;
    private Integer damage;

    public Cartridge(String caliber, Integer damage) {
        this.caliber = caliber;
        this.damage = damage;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
