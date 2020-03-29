package hm3;

public interface BookOwner {

    void addBook(Book book);
    Book giveBook(Object obj, String bookName);
}
