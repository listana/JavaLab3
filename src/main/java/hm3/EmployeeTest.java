package hm3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private static Employee workers[];
    private static Library library;
    private static Book books[];
    private static Student student;

    @BeforeAll
    private static void InitWorders() {
        if (workers != null) {
            return;
        }
        workers = new Employee[3];
        workers[0] = new Tester("Сергей", "Никонов", 30);
        workers[1] = new Developer("Руслан", "Хасбатов", 30);
        workers[2] = new Manager("Егор", "Корешев", 40);
    }

    @BeforeAll
    private static void InitLibrary() {
        if (library == null) {
            library = new Library();
            books = new Book[5];
        }
        books[0] = new Book("Отцы и Дети", "И.С. Тургенев", 10);
        books[1] = new Book("Сказки", "А.С. Пушкин", 20);
        books[2] = new Book("Горе от ума", "А. Грибоедов", 30);
        books[3] = new Book("Лев Толстой", "Анна Каренина", 40);
        books[4] = new Book("Лев Толстой", "Война и мир", 50);
    }

    @BeforeEach
    private void FixTestData(){
        // заполняем библиотеку полностью
        for (Book book : books) {
            library.addBook(book);
        }
        // у студента нет книг
        student.dropBook();
    }

    @BeforeAll
    private static void InitStudent() {
        student = new Student("Маша", "Иванова", 19);
    }

    // создать тест в котором будут создаваться сотрудники всех типов (в переменной Employee) и проверяться работа метода toString
    @Test
    void employeeToString() {
        assertEquals(workers[0].toString(), "Сергей Никонов");
        assertEquals(workers[1].toString(), "Руслан Хасбатов");
        assertEquals(workers[2].toString(), "Егор Корешев");
    }


    // создать тест в котором будет проверятся бросание исключения SleepException
    @Test
    void SleepExceptionTest() {

        for (Employee worker : workers) {
            worker.sleep();
            assertThrows(SleepException.class, () -> {
                worker.work();
            });
            worker.wakeUp();
            worker.work();
        }
    }

    //создать тесты в которых будет проверяться бросание TakeBookException в ситуациях когда это нужно
    //    (переполнение библиотеки, у студента не может быть больше одной книги, у студента или в библиотеке нет книги)
    @Test
    void TakeBookExceptionTest() {

        // переполнение библиотеки
        assertThrows(TakeBookException.class, () -> {
            library.addBook(new Book("a", "b", 2));
        });

        // у студента не может быть больше одной книги
        student.addBook(books[0]);
        assertThrows(TakeBookException.class, () -> {
            student.addBook(books[1]);
        });

        // у студента нет книги
        assertThrows(TakeBookException.class, () -> {
            student.giveBook(library, "книга");
        });

        // в библиотеке нет книги
        assertThrows(TakeBookException.class, () -> {
            library.giveBook(student, "книга");
        });
    }

    // создать тест который будет проверять правильность подсчета страниц и книг
    @Test
    void LibraryCountTest() {

        assertEquals(library.getSize(), 5);
        assertEquals(student.BooksHasRead(), 0);
        assertEquals(student.PagesHasRead(), 0);

        int pagecount = books[1].PageCount();
        library.giveBook(student, books[1].Name());
        student.readBook();
        student.dropBook();

        pagecount += books[4].PageCount();
        library.giveBook(student, books[4].Name());
        student.readBook();
        assertEquals(library.getSize(), 3);
        assertEquals(student.BooksHasRead(), 2);
        assertEquals(student.PagesHasRead(), pagecount);
    }
}