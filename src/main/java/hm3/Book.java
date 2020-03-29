package hm3;

/**
 * Класс "Книга"
 */
public class Book {

    private String author;
    private String name;
    private int pagecount;

    /**
     * Конструктор копирования
     * @param other
     */
    public Book(Book other){
        this(other.Author(), other.Name(), other.PageCount());
    }

    /**
     * Конструктор со всеми параметрами
     * @param author
     * @param name
     * @param pagecount
     */
    public Book(String author, String name, int pagecount) {
        this.author = author;
        this.name = name;
        this.pagecount = pagecount;
    }

    /**
     * Конструктор по умолчанию
     */
    public Book() {
        author = "Автор";
        name = "Какая-то книга";
        pagecount = 50;
    }

    /**
     * Возвращает название книги
     * @return
     */
    public String Name(){
        return name;
    }

    /**
     * Возвращает автора книги
     * @return
     */
    public String Author(){
        return author;
    }
    /**
     * Возвращает количество страниц
     * @return
     */
    public int PageCount(){
        return pagecount;
    }

    /**
     * перегрузка метода equals
     * объекты равны, когда все поля их равны
     * @param obj
     * @return
     */
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

    /**
     * перегрузка метода toString
     * @return
     */
    @Override
    public String toString() {
        return "\"" + name + "\" (" + author + ")";
    }
}
