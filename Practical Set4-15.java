class Employee {
    void displayDetails() {
        System.out.println("Employee: General Info");
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager: Project + Team");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        m.displayDetails();
    }
}