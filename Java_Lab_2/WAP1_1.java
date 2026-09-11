class A {
    private int x;

    // Default constructor
    public A() {
        this.x = 10;
    }

    // Parameterized constructor
    public A(int val) {
        this.x = val;
    }

    // Copy constructor
    public A(A other) {
        this.x = other.x;
    }

    public int getX() {
        return this.x;
    }
}

public class WAP1_1 {
    public static void main(String[] args) {
        // Default constructor
        A obj1 = new A();
        System.out.println("Default: x = " + obj1.getX());

        // Parameterized constructor
        A obj2 = new A(25);
        System.out.println("Parameterized: x = " + obj2.getX());

        // Copy constructor duplicating obj2
        A obj3 = new A(obj2);
        System.out.println("Instantiating with copy constructor yields: x = " + obj3.getX());
    }
}

