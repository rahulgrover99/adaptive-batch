package library;

public abstract class User {

    // All the objects of User class
    // will share the same counter variable.
    static int counter = 0;
    private String userId;
    private String name;
    private String contactInfo;

    // Dashboards will be different for a Member and a Librarian
    public abstract void displayDashboard();
    // Depending on what kind of user it is.
    public abstract boolean canBorrowBooks();

    static String generateUniqueId() {
        counter++;
        return String.valueOf(counter);
    }

    public User() {
        userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
