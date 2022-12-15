public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        Author author = new Author("Алексей", "Толстой");
        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book("Петр 1", 1850, new Author(author.getNameOfAuthor(), author.getSureNameOfAuthor()));
        Book book1 = new Book("Война и мир", 1852, new Author(author1.getNameOfAuthor(), author1.getSureNameOfAuthor()));
        System.out.println("Название книги: " + book.getNameOfBook());
        System.out.println("Имя автора: " + author.getNameOfAuthor());
        System.out.println("Фамилия автора: " + author.getSureNameOfAuthor());
        System.out.println("Год издания: " + book.getPublishingYear());
        System.out.println("Название книги: " + book1.getNameOfBook());
        System.out.println("Имя автора: " + author1.getNameOfAuthor());
        System.out.println("Фамилия автора: " + author1.getSureNameOfAuthor());
        System.out.println("Год издания: " + book1.getPublishingYear());
        book1.setPublishingYear(2024);
        System.out.println("Год издания: " + book1.getPublishingYear());
    }
}







//
///Person sarah = new Person("Sarah", 30);
///System.out.println("Имя = " + sarah.getName());
///System.out.println("sarah.getAge() = " + sarah.getAge());
///sarah.setAge(31);
///System.out.println("Возраст = " + sarah.getAge());