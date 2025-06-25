package producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    int maxSize;
    List<Object> items;

    Lock lock;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
        this.lock = new ReentrantLock();
    }

    public void addItem(Object object) {
        lock.lock();
        items.add(object);
        lock.unlock();
        System.out.println("Producer produced an item. " + items.size());
    }

    public void removeItem() {
        items.remove(items.size() - 1);
        System.out.println("Consumer consumed an item. size=" + items.size());
    }

}
