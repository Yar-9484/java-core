package resolves.HW23;

public class Book extends Papyrus {
    private String title;
    private String author;

    public Book(String material, String origin, String title, String author) {
        super(material, origin);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "material='" + getMaterial() + '\'' +
                ", origin='" + getOrigin() + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
