package exercise;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"));
        library.addBook(new Book("1984", "George Orwell", "978-0-452-28423-4"));

        // Display all books in the library
        System.out.println("All Books in the Library:");
        library.displayBooks();

        // Search for a book by title
        System.out.println("\nSearch for a Book by Title:");
        library.searchByTitle("To Kill a Mockingbird");

        // Search for books by an author
        System.out.println("\nSearch for Books by Author:");
        library.searchByAuthor("George Orwell");
    }
}
