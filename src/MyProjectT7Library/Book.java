package MyProjectT7Library;

import java.util.List;

public class Book {
    private String author;
    private String title;
    private String genre;
    private String description;
    private String year;
    private List<String> keyword;
    private Double rating;
    private int number;

    public Book(String author, String title, String genre, String description, String year, List<String> keyword, Double rating, int number) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.keyword = keyword;
        this.rating = rating;
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
