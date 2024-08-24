package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
       
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

       
        library.addBook(book1);
        library.addBook(book2);

        
        Member member = new Member("Alice");

        
        library.borrowBook("1984", member); 
        library.borrowBook("To Kill a Mockingbird", member);

        library.returnBook("1984");

        library.borrowBook("1984", member);
    }
}

