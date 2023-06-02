package animals.base;

import zoo.Soundable;

public abstract class Animal implements Soundable { //класс Animals.Animal связывается с интерфейсом zoo.Soundable и реализует метод
                                                    //sound() который есть в интерфейсе.
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract String sound(); //метод звуков
    public abstract String feed(); //эти 2 записи говорят, когда мы генерируем абстрактный метод, нам не надо ТУТ
        //прописывать работу данных методов(писать внутренности метода), т.е. мы обязываем последующие классы
        //наследники реализовать этот метод по своему.


    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s", name, feed());
    }
}