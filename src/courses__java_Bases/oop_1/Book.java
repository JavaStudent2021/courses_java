package courses__java_Bases.oop_1;

public class Book {
    Author author = new Author("Jul");
    Title title = new Title("8 Le under water");
    Content content = new Content("Fantastic");

    void show() {
        System.out.println("Book:  title - " + title.title + ", author - " + author.nameAuthor + ", content - " + content.content);
    }
}
