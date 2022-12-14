public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person sarah = new Person("Sarah", 30);
        System.out.println("Имя = " + sarah.getName());
        System.out.println("sarah.getAge() = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("Возраст = " + sarah.getAge());

        Book book = new Book ("Петр 1", 1850, "Алексей", "Толстой");
        Book book1 = new Book("Петр 2", 1950, "Лев", "Толстой");

        System.out.println("Название книги: " + book.getNameOfBook());
        System.out.println("Имя автора = " + book.getNameOfAuthor());
        System.out.println("Фамилия автора = " + book.getSureNameOfAuthor());
        System.out.println("Год = " + book.getPublishingYear());
        book.setPublishingYear(2000);
        System.out.println("Год изменен = " + book.getPublishingYear());
        System.out.println("Название книги: = " + book1.getNameOfBook());


        //Author author = new Author("Алексей", "Толстой");
        //


    }
}