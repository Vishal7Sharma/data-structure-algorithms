package design.ObserverPattern;

public class MessageSubscriberOne implements Observer{

    @Override
    public void update(Message m){
        System.out.println("MessageSubscriber 1 message " + m.getMessage());
    }

}