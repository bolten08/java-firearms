package firearms.magazine;

import firearms.cartridge.Cartridge5_45;

public abstract class AKMagazine extends Magazine<Cartridge5_45> {
    public AKMagazine(Integer capacity) {
        super(new Cartridge5_45(), capacity);
    }
}
