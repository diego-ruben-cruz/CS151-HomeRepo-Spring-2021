package ch05.polymorphism.Original;

import java.util.ArrayList;
import java.sql.*;

public class EmployeeMySQlStorage {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMP";

    //  Database credentials
    static final String USER = "username";
    static final String PASS = "password";

    Connection conn;
    Statement stmt;

    public EmployeeMySQlStorage() {
        // Copied from https://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm
        conn = null;
        stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getEmployeeById(int id) throws SQLException {
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT name FROM Employees WHERE id =" + id;
        ResultSet rs = stmt.executeQuery(sql);
        // pseudo code
        String employee = rs.getString("name");
        return employee;
    }

    public ArrayList<String> getAllEmployees() throws SQLException {
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT * FROM Employees";
        ResultSet rs = stmt.executeQuery(sql);

        ArrayList<String> allEmployees = new ArrayList<>();
        while (rs.next()) {
            allEmployees.add(rs.getString("name"));
        }
        return allEmployees;
    }
}
