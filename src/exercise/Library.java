package exercise;

public class Library {

    private final Book[] books;
    private int numberOfBooks;

    // Constructor
    public Library() {
        books = new Book[10];
        numberOfBooks = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        books[numberOfBooks] = book;
        numberOfBooks++;
        System.out.println("Book added to the library: " + book.getTitle());
    }

    // Display details of all books in the library
    public void displayBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Title: " + books[i].getTitle() +
                    ", Author: " + books[i].getAuthor() +
                    ", ISBN: " + books[i].getIsbn());
        }
    }

    // Search for a book by title
    public void searchByTitle(String title) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " +
                        "Title: " + books[i].getTitle() +
                        ", Author: " + books[i].getAuthor() +
                        ", ISBN: " + books[i].getIsbn());
                return;
            }
        }
        System.out.println("Book not found with title: " + title);
    }

    // Search for books by an author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                if (!found) {
                    System.out.println("Books found by author " + author + ":");
                    found = true;
                }
                System.out.println("Title: " + books[i].getTitle() +
                        ", ISBN: " + books[i].getIsbn());
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    public Book[] getBooks() {
        return books;
    }
}
