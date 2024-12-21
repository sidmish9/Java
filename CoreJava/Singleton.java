

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println("Hashcode of instance 1: " + instance1.hashCode());
        System.out.println("Hashcode of instance 2: " + instance2.hashCode());
        System.out.println("Hashcode of instance 3: " + instance3.hashCode());
        if (instance1 == instance2 &&  instance3 == instance1) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}


public class Singleton {
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
