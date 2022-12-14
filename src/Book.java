public class Book {
    private String nameOfBook;
    private int publishingYear;
    private String nameOfAuthor;
    private String sureNameOfAuthor;

    public Book (String nameOfBook, int publishingYear, String nameOfAuthor, String sureNameOfAuthor) {
        this.nameOfBook = nameOfBook;
        this.publishingYear = publishingYear;
        this.nameOfAuthor = nameOfAuthor;
        this.sureNameOfAuthor = sureNameOfAuthor;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }
    public String getSureNameOfAuthor() {
        return this.sureNameOfAuthor;
    }

}

