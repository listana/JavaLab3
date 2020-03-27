package hm3;

public class Book {

    private String author;
    private String name;
    private int pagecount;


    public Book(Book other){
        this(other.Author(), other.Name(), other.PageCount());
    }

    public Book(String author, String name, int pagecount) {
        this.author = author;
        this.name = name;
        this.pagecount = pagecount;
    }

    public Book() {
        author = "Автор";
        name = "Какая-то книга";
        pagecount = 50;
    }

    public String Name(){
        return name;
    }
    public String Author(){return author;}
    public int PageCount(){return pagecount;}

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.author == other.author &&
                this.name == other.name &&
                this.pagecount == other.pagecount;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" (" + author + ")";
    }
}
