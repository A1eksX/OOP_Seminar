package animals.base;

import animals.FlySpeed;
import animals.RunSpeed;

public class Owl extends Bird implements FlySpeed, RunSpeed {


    public Owl(String name) {
        super(name);
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

    @Override
    public String sound() {
        return "УУх";
    }

    @Override
    public String feed() {
        return "грызуны";
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }
}
