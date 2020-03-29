package hm3;

public class Library implements BookOwner {

    Book books[];
    final int BOOKS_MAX_COUNT = 5;

    public Library() {
        books = new Book[BOOKS_MAX_COUNT];

    }

    // проверяет, есть ли такая книга в библиотеке
    int HaveBook(Book book) {
        if(book == null) throw new NullPointerException("book is null");

        for (int i = 0; i < BOOKS_MAX_COUNT; i++) {
            if (books[i]!=null && books[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }
    // ищет книгу по названию
    int HaveBook(String bookName){
        for(int i=0; i<BOOKS_MAX_COUNT; i++){
            if (books[i] != null && books[i].Name().equals(bookName)){
                return i;
            }
        }
        return -1;
    }

    //     - проверяет есть ли в массиве такая книга
//        - если нет, то записывает ее в свободную ячеку массива и вернуть true
//            - если свободной ячейки нет, то бросам TakeBookException
//        - если такая книга есть, то вывести сообщение о то вывести сообщение о том что такая книга уже есть и вернуть false
    public void addBook(Book book) {
        if (HaveBook(book) > -1) {
            System.out.println("Книга " + book.toString() + " уже есть в библиотеке.");
            return;
        }
        for (int i = 0; i < BOOKS_MAX_COUNT; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        throw new TakeBookException("В библиотеке недостататочно свободного места!");
    }

//    - роверяет есть ли в массиве такая книга
//        - если нет, то бросается исключение TakeBookException
//        - если есть, то возвращается эта книга а ячека в массиве "очищается"
    public Book giveBook(Object obj, String bookName) {

        if (obj instanceof Student == false){
            throw new TakeBookException("Ожидается объект Student");
        }
        Student student = (Student) obj;

        int id = HaveBook(bookName);
        if (id == -1){
            throw new TakeBookException("В библиотеке нет книги \"" + bookName + "\"");
        }
        // выдаем копию книги, оригинал уничтожаем
        Book copy = new Book(books[id]);
        books[id] = null;
        student.addBook(copy);
        return copy;
    }


    // возвращает количество кни в наличии
    int getSize() {
        int count = 0;
        for(int i=0; i<BOOKS_MAX_COUNT; i++){
            if (books[i] != null){
                count++;
            }
        }
        return count;
    }
}

