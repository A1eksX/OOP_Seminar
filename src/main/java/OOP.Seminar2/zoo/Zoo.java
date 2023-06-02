package zoo;

import animals.FlySpeed;
import animals.RunSpeed;
import animals.SwimSpeed;
import animals.base.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zoo {  //создаём класс Зоопарк
    private Radio radio = new Radio(); // создаём объект типа zoo.Radio
    private List <Animal> zoo = new ArrayList<>(); //создаём список животных в зоопарке
    public Zoo addAnimal (Animal someAnimal){ //заполняем список животных в зоопарке
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {      //переопределяем то, как будет выводиться список животных
        StringBuilder builder = new StringBuilder("В зоопарке:\n");
        for (Animal animal:zoo) {
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }

    /*
    Далее, чтобы вывести звуки в зоопарке, необходимо создать список всех животных, которые издают какие-либо звуки,
    и звуки радио. Но! т.к. это РАЗНЫЕ ТИПЫ (классы (Animals.Animal и zoo.Radio), то ВЕРОЯТНО, т.к. НЕЛЬЗЯ??? в списке использовать
    разные типы, мы 2 разных типа (Animals и Radio) связываем друг с другом через интерфейс zoo.Soundable
    и в списке уже прописываем один и тот же тип zoo.Soundable для двух разных типов(классов) (Animals.Animal и zoo.Radio)
    т.о. мы объединили два РАЗНЫХ класса в один4
    */
    private List<Soundable> getSoundable(){     //создаём метод который возвращает список всех классов, кот могут делать звуки
        List<Soundable> result = new ArrayList<>(zoo); //тут в список заносим животных
        result.add(radio);      //тут добавляем радио
        return result; //в итоге получаем список животных и звук радио
    }
    public String getSound (){       //данный метод использует список getSoundable для вывода ТОЛЬКО звуков зоопарка
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable : getSoundable()) {  //тут перебираем список животных и звуков
            builder.append(soundable.sound()).append("\n"); //тут из списка вытаскиваем ТОЛЬКО звуки
        }
        return builder.toString();
    }
    public List<RunSpeed> runners (){      //создаём список ВСЕХ бегунов
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof RunSpeed){ //instanceof - если animal является объектом типа RunSpeed, тогда ...
                runners.add((RunSpeed) animal); //тут сделали приведение к типу RunSpeed, что такое upcost? downcost???
            }
        }
        return runners;
    }
    public RunSpeed getRunnerChampion(){    //создаём метод, который ищет чемпиона по бегу среди животных зоопарка
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()){
                champ = runner;
            }
        }
        return champ;
    }
    public List<FlySpeed> flyers (){
        List<FlySpeed> flyers = new ArrayList<>();
        for (Animal animal: zoo) {
            if(animal instanceof FlySpeed){
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }
    public FlySpeed flyChamp(){
        List<FlySpeed> flyers = flyers();
        FlySpeed champ = flyers.get(0);
        for (FlySpeed fly: flyers) {
            if (champ.getFlySpeed() < fly.getFlySpeed()){
                champ = fly;
            }
        }
        return champ;
    }
    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (Animal animal: zoo) {
            if(animal instanceof SwimSpeed){
                swimmer.add((SwimSpeed) animal);
            }
        }
        return swimmer;
    }

    public SwimSpeed swimChamp(){
        List<SwimSpeed> swimmer = swimmers();
        SwimSpeed champ = swimmer.get(0);
        for (SwimSpeed swim: swimmer) {
            if (champ.getSwimSpeed() < swim.getSwimSpeed()){
                champ = swim;
            }
        }
        return champ;
    }

}
