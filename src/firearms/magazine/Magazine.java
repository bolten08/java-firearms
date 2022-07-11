package firearms.magazine;

import firearms.cartridge.Cartridge;

public abstract class Magazine<T extends Cartridge> {
    private final T cartridge;
    private final Integer capacity;
    private Integer rounds = 0;

    public Magazine(T cartridge, Integer capacity) {
        this.cartridge = cartridge;
        this.capacity = capacity;
    }

    public abstract String getName();

    public T getCartridge() {
        return cartridge;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void reload() {
        rounds = capacity;
    }

    public void addRound() {
        if (rounds < capacity) {
            rounds += 1;
        } else {
            System.out.println("Magazine is full");
        }
    }

    public void removeRound() {
        if (rounds > 0) {
            rounds -= 1;
        } else {
            System.out.println("Magazine is empty");
        }
    }

    public T feed() {
        if (rounds > 0) {
            rounds -= 1;
            return cartridge;
        } else {
            System.out.println("Magazine is out of ammo");
            return null;
        }
    }
}
