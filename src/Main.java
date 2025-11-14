import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("======================================");
        System.out.println("       Library Management System       ");
        System.out.println("======================================");

        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1:
                    addBookUI();
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    findBookUI();
                    break;
                case 4:
                    removeBookUI();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n----------- MENU -----------");
        System.out.println("1 - Add Book");
        System.out.println("2 - List Books");
        System.out.println("3 - Find Book by ID");
        System.out.println("4 - Remove Book");
        System.out.println("0 - Exit");
        System.out.println("-----------------------------");
    }

    private static void addBookUI() {
        scanner.nextLine(); // buffer cleanup

        int id = library.getNextId();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        int year = readInt("Year: ");

        Book book = new Book(id, title, author, year);
        library.addBook(book);
    }

    private static void findBookUI() {
        int id = readInt("Enter book ID: ");

        Book book = library.findBook(id);
        if (book == null) {
            System.out.println("Book not found.");
        } else {
            System.out.println("Book found:");
            System.out.println(book);
        }
    }

    private static void removeBookUI() {
        int id = readInt("Enter book ID to remove: ");
        library.removeBook(id);
    }

    private static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                scanner.nextLine();
            }
        }
    }
}
