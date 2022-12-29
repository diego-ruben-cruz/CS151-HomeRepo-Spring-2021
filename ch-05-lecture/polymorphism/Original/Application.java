package ch05.polymorphism.Original;

import java.util.ArrayList;

public class Application {
    EmployeeStorage dataStorage;

    public Application(EmployeeStorage ds) {
        this.dataStorage = ds;
    }

    public void printEmployee(int id) {
        System.out.println(dataStorage.getEmployeeById(id));
    }

    public void addEmployee(String name) {
        dataStorage.addEmployee(name);
    }

    public void printAllEmployees() {
        ArrayList<String> allEmployees = dataStorage.getAllEmployees();
        for (String employee : allEmployees) {
            System.out.println(employee);
        }
    }
}

