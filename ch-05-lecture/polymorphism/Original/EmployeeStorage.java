package ch05.polymorphism.Original;

import java.util.ArrayList;

public interface EmployeeStorage {
    String getEmployeeById(int id);
    ArrayList<String> getAllEmployees();
    void addEmployee(String name);
}
