package ch05.polymorphism.Original;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDataStorage implements EmployeeStorage {
    private Map<Integer, String> employees = new HashMap<>();
    private int lastId;

    public String getEmployeeById(int id) {
        return employees.get(id);
    }

    public ArrayList<String> getAllEmployees() {
        ArrayList<String> allEmployees = new ArrayList<>();
        for (int id : employees.keySet()) {
            allEmployees.add(employees.get(id));
        }
        return allEmployees;
    }

    public void addEmployee(String name) {
        lastId++;
        employees.put(lastId, name);
    }

    public EmployeeDataStorage() {
        initializeData();
        lastId = 6;
    }

    private void initializeData() {
        // don't need to include this method into interface
        // it is just simulating that we have some data
        employees.put(1, "Amos Burton");
        employees.put(2, "Julie Mao");
        employees.put(3, "Alex Kamal");
        employees.put(4, "James Holden");
        employees.put(5, "Josephus Miller");
        employees.put(6, "Bobbie Draper");
    }
}
