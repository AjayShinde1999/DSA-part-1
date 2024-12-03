package patterns;

public class SingletonTest implements Cloneable {
    static SingletonTest singletonTest;

    private SingletonTest() {

    }

    public static synchronized SingletonTest getInstance() {
        if (singletonTest == null) {
            singletonTest = new SingletonTest();
        }
        return singletonTest;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not supported");
    }

    public static void main(String[] args) {
        SingletonTest instance1 = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();
        System.out.println(instance1 == instance2);

        try {
            SingletonTest cloned = (SingletonTest) instance1.clone();
            System.out.println(cloned == instance1);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

}
