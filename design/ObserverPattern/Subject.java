package design.ObserverPattern;

public interface Subject {
    public void attach(Observer o);
    
    public void deattach(Observer o);

    public void notify(Message m);

}