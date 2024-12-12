package resolves.HW23;

public class Comic extends Book {
    private String illustrator;

    public Comic(String material, String origin, String title, String author, String illustrator) {
        super(material, origin, title, author);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "material='" + getMaterial() + '\'' +
                ", origin='" + getOrigin() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", illustrator='" + illustrator + '\'' +
                '}';
    }
}

