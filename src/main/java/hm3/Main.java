package hm3;

public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Лена", "Черноярова", 31);
        Employee obj2 = new Employee();

        Student st1 = new Student();
        Student st2 = new Student("Евгений", "Олежкин", 21);
        st2.intoduce();
        st1.intoduce();


        st2.addBook(new Book("Лев Толстой", "Война и мир", 55555));
       // st2.addBook(new Book("Лев Толстой", "Война и мир", 55555));

        st2.dropBook();
        st2.addBook(new Book("Лев Толстой", "Анна Каренина", 55555));

        Library lib = new Library();
        Book bb = st2.giveBook( lib,"Анна Каренина");
        System.out.println(bb.toString());

    }
}
