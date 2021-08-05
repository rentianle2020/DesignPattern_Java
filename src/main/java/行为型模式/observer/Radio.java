package 行为型模式.observer;

import java.util.LinkedList;
import java.util.List;

public class Radio {

    List<Listener> listenerList = new LinkedList<>();

    public void addListener(Listener listener){
        listenerList.add(listener);
    }

    public void playMusic(String music){
        listenerList.forEach(listener -> listener.listen(music));
    }
}
