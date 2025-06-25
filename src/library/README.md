Build a library system where:
1. The library can have Books, magazines and Journals.
2. Some types of items can be loaned and some are only for reading at library.
3. Users (Members : Students, Professors) can borrow and return different types of Library items.
4. Books have categories (Fiction, Non-fiction, Academic).
5. A loan management system keeps track of issued books.
6. Implement features like late fees and borrowing limits.

Milestone A : Represent User structure
- Create the Base User Class
- Add Constructors to User
- Create a Subclass Member
- Create a Subclass Librarian
- Implement generateUniqueId using Static and Final Concepts

Task 1: Create the Base User Class
- Objective: Introduce abstract classes, encapsulation, and basic object-oriented principles.

Step 1.1: 
- Define a class User with the following private attributes:
- String userId
- String name
- String contactInfo

Step 1.2: 
- Add getter and setter methods for name and contactInfo.

- Challenge: Use encapsulation by keeping attributes private and accessing them through getters/setters.

Task 2: Add Constructors to User

Objective: Explore constructors (default, parameterized, and copy).

Step 2.1: Implement:
- A default constructor that initializes userId using generateUniqueId method (We can return 0 from this method for now )
- A parameterized constructor that initializes name and contactInfo.
- A copy constructor that copies attributes from another User.
- 
Step 2.2: Test constructors by creating instances using all three constructors in a test class.

Task 3

declare the following abstract methods:
- void displayDashboard()
- boolean canBorrowBooks()


Task 4: Create a Subclass Member

Objective: Implement inheritance and method overriding.

Step 4.1: Create a concrete subclass Member that extends User.

Step 4.2: Add the following private attributes:
- int borrowedBooksCount
- A constant MAX_BORROW_LIMIT = 5

Step 4.3: Override the abstract methods:
- displayDashboard() should display Member Dashboard and Books Borrowed: X.
- canBorrowBooks() should return true if borrowedBooksCount < MAX_BORROW_LIMIT.

Step 4.4: Add constructors to initialize Member.


---

Task 1: Create the Lendable Interface

Objective: Introduce interfaces and compile-time polymorphism.

Step 1.1: Define the Lendable interface with the following methods:
- boolean lend(User user)
- void returnBook(User user)
- boolean isAvailable()

Step 1.2: Explain the purpose of interfaces and how they enable compile-time polymorphism.

Step 1.3: Create a basic test class to simulate borrowing a book by defining a dummy class that implements Lendable.

----

Task 2: Implement the Abstract Book Class

Objective: Explore abstract classes, encapsulation, and method overriding.

Step 2.1: Create the Book class that implements Lendable. Add the following private attributes:
- String isbn
- String title
- String author
- boolean isAvailable

Step 2.2: Implement the methods from Lendable:
- lend(User user): If the book is available and the user can borrow, mark the book as unavailable and return true.
- returnBook(User user): Mark the book as available.
- isAvailable(): Return the availability status.

Step 2.3: Explain why the class is abstract and add an abstract method void displayBookDetails().


---

Objective: Understand and implement collections to manage system-wide data.

Step 1.1: Create a class LibraryManagementSystem with:
- A List<Book> named bookInventory to store all books.
- A List<User> named registeredUsers to store all registered users.

Step 1.2: Add methods:
- addBook(Book book) to add a book to bookInventory.
- registerUser(User user) to add a user to registeredUsers.

Step 1.3: Test the collections by adding a few books and users, then print their details.

---
Task 2: Implement Search Functionality

Objective: Demonstrate compile-time polymorphism through method overloading.

Step 2.1: Add a static method searchBooks(String criteria) to search for books by title or author. Use a loop to iterate over bookInventory and add matching books to a result list.

Step 2.2: Overload searchBooks with additional parameters:
searchBooks(String criteria, String type) for searching books of a specific type ("TextBook" or "NovelBook").

Implement this method to filter results based on the type of book.
Java Enums

Step 2.3: Test the overloaded methods with different inputs and ensure they return correct results.