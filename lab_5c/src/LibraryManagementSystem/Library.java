package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Borrowable> catalog;

    public Library() {
        catalog = new HashMap<>();
    }

    public void addBook(Book book) {
        catalog.put(book.getTitle(), book);
    }

    public void borrowBook(String title, Member member) {
        Borrowable book = catalog.get(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            System.out.println(member.getName() + " has borrowed: " + title);
        } else {
            System.out.println("Sorry, the book is not available or does not exist.");
        }
    }

    public void returnBook(String title) {
        Borrowable book = catalog.get(title);
        if (book != null) {
            book.returnItem();
        } else {
            System.out.println("The book does not exist in the catalog.");
        }
    }
}
