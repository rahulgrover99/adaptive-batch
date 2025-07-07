package generics.labsession;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewItems {
    private final LinkedList<Item> items;
    private final int MAX_SIZE;

    public RecentlyViewItems(int limit) {
        this.items = new LinkedList<>();
        MAX_SIZE = limit;
    }
    public void addRecentlyViewedItem(Item item) {
        items.remove(item);
        items.addFirst(item);
        if (items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }
    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items);
    }
}
