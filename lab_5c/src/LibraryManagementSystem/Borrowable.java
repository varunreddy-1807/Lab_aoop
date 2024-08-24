package LibraryManagementSystem;

public interface Borrowable {
    boolean isAvailable();
    void borrow();
    void returnItem();
}
