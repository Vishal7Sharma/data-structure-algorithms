package design.ObserverPattern;

public class TestObserverPattern {
    public static void main(String[] args) {
        MessagePublisher messagePublisher = new MessagePublisher();
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.notify(new Message("First Message"));

        messagePublisher.attach(messageSubscriberTwo);
        messagePublisher.notify(new Message("Second Message"));

        messagePublisher.deattach(messageSubscriberOne);
        messagePublisher.notify(new Message("Third Message"));

    }

}