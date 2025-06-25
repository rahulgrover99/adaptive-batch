package semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Store store;

    public Producer(Semaphore producerSemaphore, Semaphore consumerSemaphore, Store store) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire(); // 4 -> 3
                store.addItem(new Object()); // finished the job
                consumerSemaphore.release(); // 0 -> 1

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
