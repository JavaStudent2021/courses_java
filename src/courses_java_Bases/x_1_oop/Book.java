package courses_java_Bases.x_1_oop;

public class Book {
    Author author = new Author("Jul");
    Title title = new Title("8 Le under water");
    Content content = new Content("Fantastic");

    void show() {
        System.out.println("Book:  title - " + title.title + ", author - " + author.nameAuthor + ", content - " + content.content);
    }
}
