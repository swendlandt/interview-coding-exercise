package exercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    Library subject;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        subject = new Library();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addBook() {
        subject.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"));

        assertEquals(10, subject.getBooks().length);
        assertEquals("The Catcher in the Rye", subject.getBooks()[0].getTitle());
    }

    @Test
    void displayBooks() {
        subject.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"));

        subject.displayBooks();

        assertEquals("Book added to the library: The Catcher in the Rye\n" +
                "Title: The Catcher in the Rye, Author: J.D. Salinger, ISBN: 978-0-316-76948-0\n", outContent.toString());
    }

    @Test
    void searchByTitle() {
        subject.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"));

        subject.searchByTitle("The Catcher in the Rye");

        assertEquals("Book added to the library: The Catcher in the Rye\n" +
                "Book found: Title: The Catcher in the Rye, Author: J.D. Salinger, ISBN: 978-0-316-76948-0\n", outContent.toString());
    }

    @Test
    void searchByAuthor() {
        subject.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"));

        subject.searchByAuthor("J.D. Salinger");

        assertEquals("Book added to the library: The Catcher in the Rye\n" +
                "Books found by author J.D. Salinger:\n" +
                "Title: The Catcher in the Rye, ISBN: 978-0-316-76948-0\n", outContent.toString());
    }
}
