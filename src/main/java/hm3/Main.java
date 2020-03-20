package hm3;

public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Лена", "Черноярова", 31);
        Employee obj2 = new Employee();
        System.out.println(obj.toString());
        obj.intoduce();
        System.out.println(obj2.toString());
        obj2.intoduce();
        obj.sleep();
        obj.work();
    }
}
