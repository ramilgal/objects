import java.time.LocalDate;
public class Book {
    private String nameOfBook;
    private int publishingYear;
    private Author author;
    public Book (String nameOfBook, int publishingYear, Author author) {
        this.nameOfBook = nameOfBook;
        this.publishingYear = publishingYear;
        this.author = new Author(author.getNameOfAuthor(), author.getSureNameOfAuthor());
    }
    public String getNameOfBook() {
        return this.nameOfBook;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        int currentYear = LocalDate.now().getYear();
        if (publishingYear > currentYear) {
            System.out.println("Введен некорректный год издания: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}