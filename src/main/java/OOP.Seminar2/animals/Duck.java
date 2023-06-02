package animals;

import animals.base.Bird;

public class Duck extends Bird implements RunSpeed,FlySpeed, SwimSpeed {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Кря-кря";
    }

    @Override
    public String feed() {
        return "Всё ем";
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, FlySpeed: %d, animals.SwimSpeed: %d", super.toString(), getRunSpeed(), getFlySpeed(), getSwimSpeed());
    }

    @Override
    public int getFlySpeed() {
        return 80;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
