package ch05.polymorphism.WithInterface;

import java.util.ArrayList;

public class NaiveEmployeeDatastorage implements DataStorage {
    private ArrayList<String> employees;

    public NaiveEmployeeDatastorage() {
        employees = new ArrayList<>();
        employees.add("Jamie Oliver");
        employees.add("Gordong Ramsay");
    }

    public String getEmployeeById(int id) {
        return employees.get(id % employees.size());
    }

    public ArrayList<String> getAllEmployees() {
        return (ArrayList<String>) employees.clone();
    }
}

