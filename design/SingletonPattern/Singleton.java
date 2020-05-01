package design.SingletonPattern;

class EagerSingleton {
    String value = "Eager Singleton object";
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // private constructor
    }

    public String getValue() {
        return this.value;
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}

class LazySingleton {
    String value = "Lazy Singleton object";
    private static LazySingleton instance = null;

    private LazySingleton() {
        // private constructor
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            System.out.println("Creating Lazy instance");
            return instance = new LazySingleton();
        }
        return instance;
    }
}

class ThreadSafeLazySingleton {
    String value = "Thread safe lazy singleton object";
    private static ThreadSafeLazySingleton instance = null;

    private ThreadSafeLazySingleton() {
        // Private constructor for thread safe lazy singleton object
    }

    public static ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazySingleton.class) {
                if (instance == null) {
                    System.out.println("Creating thread safe singleton instance");
                    return instance = new ThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }
}

public class Singleton extends Thread {
    public void run() {
        System.out.println("Singleton pattern multiple implementation");
        for (int i = 0; i < 2; i++) {
            // EagerSingleton eagerSingleton = EagerSingleton.getInstance();
            // System.out.println("EagerSingleton value is " + eagerSingleton);

            // LazySingleton lazySingleton = LazySingleton.getInstance();
            // System.out.println("LazySingleton value is " + lazySingleton);

            ThreadSafeLazySingleton threadSafeLazySingleton = ThreadSafeLazySingleton.getInstance();
            System.out.println("ThreadSafeSingleton instance is " + threadSafeLazySingleton);

        }
    }

    public static void main(String args[]) {
        Singleton object1 = new Singleton();
        Singleton object2 = new Singleton();
        object1.start();
        try {
            object1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        object2.start();
        
    }

}
