package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private final List<Book> bookInventory;
    private final List<User> registeredUsers;

    public LibraryManagementSystem() {
        this.registeredUsers = new ArrayList<>();
        this.bookInventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookInventory.add(book);
    }

    public void registerUser(User user) {
        this.registeredUsers.add(user);
    }
}
