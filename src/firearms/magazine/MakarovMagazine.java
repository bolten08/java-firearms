package firearms.magazine;

import firearms.cartridge.Cartridge9_0;

public abstract class MakarovMagazine extends Magazine<Cartridge9_0> {
    public MakarovMagazine(Integer capacity) {
        super(new Cartridge9_0(), capacity);
    }
}
