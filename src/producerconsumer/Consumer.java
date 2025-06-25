package producerconsumer;

public class Consumer implements Runnable{

    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            synchronized(store) { // store.lock()
                if (store.items.size() > 0) {
                    store.removeItem();
                }
            }
            // store.unlock.

        }
    }
}
