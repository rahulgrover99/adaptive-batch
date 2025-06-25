package producerconsumer;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StoreBlockingQueue {
    int maxSize;
    BlockingQueue<Object> items;

    public StoreBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayBlockingQueue<>(maxSize);
    }

    public void addItem(Object object) {
        items.add(object);
        System.out.println("Producer produced an item. size=" + items.size());
    }

    public void removeItem() {
        items.poll();
        System.out.println("Consumer consumed an item. size=" + items.size());
    }

}
