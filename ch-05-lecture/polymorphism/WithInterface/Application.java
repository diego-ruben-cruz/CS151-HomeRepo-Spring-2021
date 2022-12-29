package ch05.polymorphism.WithInterface;

import java.util.ArrayList;

public class Application {
    DataStorage dataStorage;

    public Application(DataStorage ds) {
        this.dataStorage = ds;
    }

    public void printEmployee(int id) {
        System.out.println(dataStorage.getEmployeeById(id));
    }

    public void printAllEmployees() {
        ArrayList<String> allEmployees = dataStorage.getAllEmployees();
        for (String employee : allEmployees) {
            System.out.println(employee);
        }
    }
}
