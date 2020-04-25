package design.ObserverPattern;

public class MessageSubscriberTwo implements Observer{
    @Override
    public void update(Message m){
        System.out.println("MessageSubscribe 2 message " + m.getMessage());
    }

}