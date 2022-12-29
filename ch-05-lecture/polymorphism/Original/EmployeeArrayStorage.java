package ch05.polymorphism.Original;

import java.util.ArrayList;

public class EmployeeArrayStorage implements EmployeeStorage {
    private ArrayList<String> employees;

    public EmployeeArrayStorage() {
        employees = new ArrayList<>();
        employees.add("Josh");
        employees.add("Anna");
    }

    @Override
    public void addEmployee(String name) {
        employees.add(name);
    }

    @Override
    public ArrayList<String> getAllEmployees() {
        return (ArrayList<String>) employees.clone();
    }

    @Override
    public String getEmployeeById(int id) {
        return employees.get(id - 1);
    }
}
