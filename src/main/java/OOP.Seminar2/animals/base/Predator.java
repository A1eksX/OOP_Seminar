package animals.base;

import animals.base.Animal;

public abstract class Predator extends Animal {

    public Predator(String name) {
        super(name);
    }
    @Override
    public String feed(){       //переопределяем метод ЕДА, для вида "Хищник"

        return "meat";
    }
}
