package ch05.polymorphism.Original;

public class Tester {
    public static void main(String[] args) {
        EmployeeDataStorage employeeDS = new EmployeeDataStorage();
        Application app = new Application(employeeDS);

        app.printEmployee(5);
        System.out.println("__________");
        app.addEmployee("Marco Inaros");
        app.printAllEmployees();

        System.out.println("__________");

        EmployeeArrayStorage ds = new EmployeeArrayStorage();
        Application app2 = new Application(ds);

        app2.printEmployee(1);
        System.out.println("__________");
        app2.printAllEmployees();

    }
}
