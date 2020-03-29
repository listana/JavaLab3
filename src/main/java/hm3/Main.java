package hm3;

public class Main {

    public static void TestEmployees(){
        Employee employees[] = new Employee[3];
        employees[0] = new Tester("Вася", "Пупкин", 32);
        employees[1] = new Developer("Евгений", "Олежкин", 39);
        employees[2] = new Manager("Маша", "Иванова", 28);

//        employees[0] = new Tester();
//        employees[1] = new Developer();
//        employees[2] = new Manager();

        Developer copy = new Developer(employees[0]);
        copy.work();

        for(Employee worker: employees){
            worker.sleep();
            worker.wakeUp();
            worker.work();
        }
    }

    public static void main(String[] args) {

        TestEmployees();

//        создать пременную Human human
//        записать в нее объект Student
//        уложить его спать и разбудить
//        создать библиотеку и записать ее в переменную BookOwner
//        положить в библиотеку 3 книги
//        студет должен получить  из библиотеки книгу, прочитать, положить обратно в библиотеку
//                (использовать приведение типов если нужно)
//        этот же студет должен взять другую книгу, прочитать ее и выбросить
//        в библиотек должно остаться 2 книги
//

        Human human = new Student("Евгений", "Олежкин", 21);
        human.sleep();
        human.wakeUp();

        Library BookOwner = new Library();
        Book[] books = new Book[3];
        books[0] = new Book("И.С. Тургенев", "Отцы и Дети", 10);
        books[1] = new Book("А.С. Пушкин", "Сказки", 20);
        books[2] = new Book("А. Грибоедов", "Горе от ума", 30);
        for(Book b: books){
            BookOwner.addBook(b);
        }
        BookOwner.giveBook(human,"Сказки");
        Student student = (Student)human;
        student.readBook();
        student.giveBook(BookOwner, "Сказки");

        BookOwner.giveBook(human,"Горе от ума");
        student.readBook();
        student.dropBook();

        System.out.println("Книг в библиотеке: "+BookOwner.getSize());

        //        создать переменную Worker worker, создать и записать сюда тестировщика
//        вызвать метод work
//        создать на основе студента Интерна и записать в переменную worker
//        вызвать метод work
        Worker worker = new Tester("Ирина", "Ивановна", 26);
        worker.work();

        worker = new Intern(student);
        worker.work();

    }
}
