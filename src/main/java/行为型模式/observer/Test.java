package 行为型模式.observer;

public class Test {

    public static void main(String[] args) {

        Radio musicRadio = new Radio();
        musicRadio.addListener(new Listener("小红"));
        musicRadio.addListener(new Listener("小明"));
        musicRadio.addListener(new Listener("tyler"));

        musicRadio.playMusic("talking to the moon");
    }
}
