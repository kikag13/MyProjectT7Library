package MyProjectT7Library;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    private List<User> users;
    private Book book;
    private boolean isOpen;

    public LibrarySystem(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteBook(Book book){
        books.remove(book);
    }

    public void openFile(String fileName){
        isOpen = true;
    }

    public void saveToFile(String fileName) {
    }

}
