package animals.base;

import animals.base.Animal;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }
    @Override
    public String feed(){   //переопределяем метод ЕДА, для вида "Травоядные"

        return "grass";
    }
}
