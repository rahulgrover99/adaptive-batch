package generics.labsession;

import java.util.*;

public class Inventory<T extends Item> {
    private Map<String, T> map;

    public Inventory() {
        this.map = new HashMap<>();
    }

//    "ADB2134"

    public void add(T item) {

        if (map.containsKey(item.getId())) {
            throw new IllegalArgumentException("Already exists.");
        }

        map.put(item.getId(), item);
    }

    public void remove(String id) {
        map.remove(id);
    }
    public void remove(Item item) {
        map.remove(item.getId());
    }

    public T get(String id) {
        return map.get(id);
    }

    public List<T> getAll() {
        return new ArrayList<>(map.values());
    }

    public List<T> getAll(Comparator<Item> comparator) {
        List<T> items = new ArrayList<>(map.values());
        Collections.sort(items, comparator);
        return items;
    }`
}
