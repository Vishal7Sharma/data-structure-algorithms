package design.ObserverPattern;

public class Message {

    final String message;
    public Message(String message){
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }

}