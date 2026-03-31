class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee(101, "Amit");
            Employee e2 = (Employee) e1.clone();

            System.out.println(e1.id + " " + e1.name);
            System.out.println(e2.id + " " + e2.name);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
