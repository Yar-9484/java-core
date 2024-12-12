package resolves.HW31;

public class Magazine implements Printable {
    private String title;
    private String issue;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title + ", Issue: " + issue);
    }

    // Геттери та сеттери (якщо потрібні)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
