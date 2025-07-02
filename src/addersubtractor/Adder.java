package addersubtractor;

import producerconsumer.Producer;

public class Adder implements Runnable{


    Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (counter) {
                counter.i += 1;
            }
        }
    }
}
