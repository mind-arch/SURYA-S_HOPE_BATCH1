class LibraryItem {
    String title;
    int id;

    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem {
    String author;

    Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", 101, "Surya");
        b.display();
    }
}