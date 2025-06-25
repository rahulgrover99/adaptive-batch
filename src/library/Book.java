package library;

abstract class Book implements Lendable{

    String isbn;
    String title;
    String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    public abstract void displayBookDetails();
}
