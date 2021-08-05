package 行为型模式.observer;

public class Listener {

    private String name;

    public Listener(String name) {
        this.name = name;
    }

    public void listen(String radioMessage){
        System.out.println(name + "听到了" + radioMessage);
    }
}
