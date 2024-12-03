package patterns;

public class CloneExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        try {
            MyClass clonedObj = (MyClass) obj.clone();
            System.out.println("Object cloned successfully");
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
    }
}

class MyClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

