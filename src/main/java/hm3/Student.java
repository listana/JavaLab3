package hm3;

public class Student extends Human implements BookReader, BookOwner {

    // студент может хранить одну книгу
    private Book book;

    // поля с количеством прочитанных книг и страниц
    private int pagesHasRead = 0;
    private int booksHasRead = 0;

    public int PagesHasRead() {
        return pagesHasRead;
    }

    public int BooksHasRead() {
        return booksHasRead;
    }


    public Student(String name, String sirname, int age) {
        super(name, sirname, age);
    }


    public Student() {
        super();
    }

    //- делает +1 к прочитанным книгам и должен правильно увеличивать количество страниц
    public void readBook() {
        if (isSleep()) {
            return;
        }
        pagesHasRead += book.PageCount();
        booksHasRead++;
    }

//    метод addBook должен
//        - сохранять полученную книгу в соответсвующее поле
//        - бросать исключение TakeBookException с информацией о том, что у студента уже есть книга и он не может хранить больше одной книги
//            (нужно указать у какого студента какая книга уже есть и какую книгу он не може взять)

    public void addBook(Book book) {
        if (isSleep()) {
            return;
        }
        if (this.book != null) {
            throw new TakeBookException(toString() + " не может взять книгу " + this.book.toString() +
                    ", т.к. уже взял " + book.toString());
        }
        this.book = book;

    }

//      - возращает книгу если у студента есть книга с таким названием и очищаться соответствующее поле (null в помощь)
//        - бросает исключение TakeBookException если такой книги нет, но есть другая книга
//            (должно быть информативное сообщение)
//        - если у студента нет никакой книги (поле book = null) бросить TakeBookException и выводить в консоль соответствующее сообщение

    public Book giveBook(Object obj, String bookName) {

        if (obj instanceof Library == false){
            throw new TakeBookException("Ожидается объект Library");
        }

        Library library = (Library) obj;
        if (isSleep()) {
            return null;
        }
        if (book == null) {
            throw new TakeBookException("У студента " + toString() + " нет книг, нечего возвращать");
        }
        if (!book.Name().equals(bookName)) {
            throw new TakeBookException("У студента " + toString() + " нет книги \"" + bookName + "\", но есть " + book.toString());
        }

        Book copy = new Book(book);
        book = null;
        library.addBook(copy);
        return copy;
    }


    //  - присваивает полю book значение null и ввыводит сообщение о том что такйо то студент выбросил такуюто книгу
    public void dropBook() {
        if (isSleep()) {
            return;
        }
        if (book != null) {
            System.out.println("Студент " + this.toString() + " выбросил книгу " + book.toString());
            book = null;
        }
    }
}
