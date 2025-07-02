package addersubtractor;

public class Counter {
    int i = 0;


    void increment() {
        synchronized (this) {
            i += 1;
        }
    }

    synchronized void decrement() {
            i -= 1;
    }

}
