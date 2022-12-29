package ch05.polymorphism.WithInterface;

public class Tester {
    public static void main(String[] args) {

        EmployeeDataStorage employeeDS = new EmployeeDataStorage();
        Application app = new Application(employeeDS);

        app.printEmployee(5);
        System.out.println("---------------------");
        app.printAllEmployees();

        System.out.println("---------------------");

        NaiveEmployeeDatastorage simpleDS = new NaiveEmployeeDatastorage();
        Application app2 = new Application(simpleDS);
        app2.printEmployee(4);
        System.out.println("---------------------");
        app2.printAllEmployees();
    }
}

