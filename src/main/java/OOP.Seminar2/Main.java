import animals.*;
import animals.base.Animal;
import animals.base.Owl;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal beer = new Beer("Потапыч"); //Создаю объект класса Animals.Beer и даю ему имя
        Animal cow = new Cow("Мурка");
        Animal duck = new Duck("Donald");

        Zoo zoo = new Zoo();
        zoo.addAnimal(beer).addAnimal(cow).addAnimal(duck).addAnimal(new Owl("Сава"));
        System.out.println(zoo);  //выводим список животных зоопарка

        System.out.println(zoo.getSound());
        System.out.println("---Runner---");
        RunSpeed champ = zoo.getRunnerChampion();
        System.out.println(champ);

        for (RunSpeed runner: zoo.runners()) {
            System.out.println(runner);
        }
        System.out.println("---ChampFlyers---");
        FlySpeed flyChamp = zoo.flyChamp();
        System.out.println(flyChamp);
        System.out.println("---Flyers---");
        for (SwimSpeed swimmer : zoo.swimmers()) {
            System.out.println(swimmer);
        }
        System.out.println("---ChampSwims---");
        System.out.println(zoo.swimChamp());
    }
}
