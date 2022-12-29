package ch05.polymorphism.WithInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDataStorage implements DataStorage {
    private Map<Integer, String> employees = new HashMap<Integer, String>();

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

    public EmployeeDataStorage() {
        initializeData();
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
