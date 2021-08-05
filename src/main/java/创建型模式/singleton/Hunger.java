package 创建型模式.singleton;

public class Hunger {

    private static final Hunger hunger = new Hunger();

    /*static{
        hunger = new Hunger();
    }*/

    private Hunger(){

    }

    public static Hunger getHunger(){
        return hunger;
    }
}
