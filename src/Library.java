import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        // Load existing data from JSON
        books = JsonStorage.load();
    }

    public void addBook(Book book) {
        books.add(book);
        JsonStorage.save(books);
        System.out.println("📚 Book added successfully.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("⚠ No books in the library.");
            return;
        }

        System.out.println("\n📘 Library Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public void removeBook(int id) {
        Book book = findBook(id);

        if (book == null) {
            System.out.println("❌ Book not found.");
            return;
        }

        books.remove(book);
        JsonStorage.save(books);
        System.out.println("🗑 Book removed.");
    }

    public int getNextId() {
        if (books.isEmpty()) return 1;
        return books.get(books.size() - 1).getId() + 1;
    }
}
