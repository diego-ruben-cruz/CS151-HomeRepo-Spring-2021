package ch05.polymorphism.WithInterface;

import java.util.ArrayList;

interface DataStorage {
    String getEmployeeById(int id);
    ArrayList<String> getAllEmployees();

}

