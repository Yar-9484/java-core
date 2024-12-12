package resolves.hw1;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String genre;

    // Конструктор
    public Book(String title, int pages, String author, String genre) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.genre = genre;
    }

    // Геттери та сеттери
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
