package design.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    private List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        list.add(o);
    }

    @Override
    public void deattach(Observer o) {
        list.remove(o);
    }

    @Override
    public void notify(Message m) {
        for(Observer o: list){
            o.update(m);
        }
    }

}