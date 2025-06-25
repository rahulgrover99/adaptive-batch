package first;

public class Greetings {



    // Method overloading
    void hello() {
        System.out.println("Hello world!");
    }

    void hello(String s) {
        System.out.println("hello, " + s);
    }

    void hello(Dog d) {
        System.out.println("hello dawg!");
    }
}
