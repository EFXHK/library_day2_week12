import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String genre;
//
//    private ArrayList<Book> book;
//
//    public Book(Book book) {
//    }

//    public Book(ArrayList<Book> book) {
//        this.book = book;
//    }
//
//
//    public int getBookCount() {
//        return this.book.size();

    static int numberOfBooks = 0;

    {
        numberOfBooks += 1;
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "DUNGEONS & DRAGONS - Player's Handbook";
        book1.author = "Johnathan Tweet";
        book1.genre = "Role-playing game";

        Book book2 = new Book();
        book2.title = "DUNGEONS & DRAGONS - Dungeon Master's Guide";
        book2.author = "Monte Cook";
        book2.genre = "Instructional";

        Book book3 = new Book();
        book3.title = "DUNGEONS & DRAGONS - Monster Manual";
        book3.author = "Skip Williams";
        book3.genre = "Nature";

        System.out.println(
                       "Title: "  + book1.title
        + " " + '\n' + "Author: " + book1.author
        + " " + '\n' + "Genre: "  + book1.genre
        );

        System.out.println(
                       "Title: "  + book2.title
        + " " + '\n' + "Author: " + book2.author
        + " " + '\n' + "Genre: "  + book2.genre
        );

        System.out.println(
                       "Title: "  + book3.title
        + " " + '\n' + "Author: " + book3.author
        + " " + '\n' + "Genre: "  + book3.genre
        );

        System.out.println(Book.numberOfBooks);
    }



//    public int bookCount() {
//        return this.book.size();
//
    }

