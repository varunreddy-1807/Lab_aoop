package LibraryManagementSystem;

public class Book implements Borrowable {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is not available: " + title);
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("Book returned: " + title);
    }
}

