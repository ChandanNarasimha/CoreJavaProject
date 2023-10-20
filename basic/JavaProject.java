package basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaProject {
private static List<Book> books = new ArrayList<>();
private static int bookId = 1;

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("1. Add Book");
System.out.println("2. Remove Book");
System.out.println("3. Display All Books");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();

switch (choice) {
case 1:
addBook(scanner);
break;
case 2:
removeBook(scanner);
break;
case 3:
displayBooks();
break;
case 4:
System.out.println("Exiting program...");
System.exit(0);
break;
default:
System.out.println("Invalid choice!");
}
}
}

private static void addBook(Scanner scanner) {
System.out.print("Enter book title: ");
String title = scanner.next();
System.out.print("Enter book author: ");
String author = scanner.next();

Book book = new Book(bookId, title, author);
books.add(book);
bookId++;
System.out.println("Book added successfully!");
}

private static void removeBook(Scanner scanner) {
System.out.print("Enter book ID: ");
int id = scanner.nextInt();

boolean removed = books.removeIf(book -> book.getId() == id);
if (removed) {
System.out.println("Book removed successfully!");
} else {
System.out.println("Book not found!");
}
}

private static void displayBooks() {
System.out.println("ID\tTitle\tAuthor");
for (Book book : books) {
System.out.println(book.getId() + "\t" + book.getTitle() + "\t" + book.getAuthor());
}
}
}

class Book {
private int id;
private String title;
private String author;

public Book(int id, String title, String author) {
this.id = id;
this.title = title;
this.author = author;
}

public int getId() {
return id;
}

public String getTitle() {
return title;
}

public String getAuthor() {
return author;
}
}