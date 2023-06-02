package zoo;

import zoo.Soundable;

public class Radio implements Soundable { //класс zoo.Radio связывается с интерфейсом zoo.Soundable и реализует метод
                                //sound() который есть в интерфейсе.
    public String sound (){

        return "Bla-bla-blaaaa";
    }
}
