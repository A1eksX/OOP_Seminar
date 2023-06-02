package animals;

import animals.base.Predator;

public class Beer extends Predator implements RunSpeed, SwimSpeed {

    public Beer(String name) {

        super(name);
    }

    @Override
    public String sound() {

        return "Reawr";
    }

    @Override
    public String toString() {
        return String.format("Beer: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {

        return 40;
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }
}
