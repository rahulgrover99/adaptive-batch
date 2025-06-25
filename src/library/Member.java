package library;

public class Member extends User {

    private static final int MAX_BORROW_LIMIT = 5;

    private int borrowedBooksCount;

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount <= MAX_BORROW_LIMIT;
    }
}
