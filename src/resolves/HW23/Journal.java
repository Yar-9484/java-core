package resolves.HW23;

public class Journal extends Book {
    private int issueNumber;

    public Journal(String material, String origin, String title, String author, int issueNumber) {
        super(material, origin, title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "material='" + getMaterial() + '\'' +
                ", origin='" + getOrigin() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", issueNumber=" + issueNumber +
                '}';
    }
}
