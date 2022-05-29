package DesignPatterns;
// Youtube Coding Simplified
/*
 * Creational Design patterns-object creation
 * Only one instance of the class should exist
 * Used in logging,Session,Drivers-only one time we use this
 *
 *
 * Implementation :
 * Constructor should be private
 * It gets memory only once because of static, it contains the instance of the Singleton class.
 */
//Early Instantiation: creation of instance at load time.
class SingletonEarly {
    private static SingletonEarly instance = new SingletonEarly();

    private SingletonEarly() {
    }

    public static SingletonEarly getInstance() {
        return instance;
    }
}

//Lazy Instantiation: creation of instance when required.
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

// Method Synchronization
class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod() {
    }

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

//// By using block Synchronization
class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}

public class SingletonExample {

    public static void main(String[] args) {
        SingletonSynchronized instance = SingletonSynchronized.getInstance();

        System.out.println(instance);

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

        System.out.println(instance1);
    }
}
