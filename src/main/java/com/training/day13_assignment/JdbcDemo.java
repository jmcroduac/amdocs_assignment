package com.training.day13_assignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import com.training.day13_assignment.model.Student;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521/xe";
            String userName = "system";
            String password = "system";

            Connection con = DriverManager.getConnection(url,userName,password);

            //Store more records in Student table using stored procedure
            String query1 = "{call ADD_STUDENT(?,?,?,?)}";
            CallableStatement cs = con.prepareCall(query1);
            cs.setString(1,"ST105");
            cs.setString(2,"KEITH");
            cs.setString(3,"MAKATI");
            cs.setString(4,"IT");
            cs.execute();

            //Fetch all records from student table
            String query2 = "SELECT * FROM STUDENT";
            cs = con.prepareCall(query2);
            cs.execute();
            ResultSet rs = cs.executeQuery();

            ArrayList<Student> studArr = new ArrayList<Student>();

            while(rs.next()){
                Student stud = new Student();
                stud.setStudId(rs.getString(1));
                stud.setStudName(rs.getString(2));
                stud.setStudAddress(rs.getString(3));
                stud.setDepartments(rs.getString(4));
                studArr.add(stud);
            }

            System.out.println(studArr.size());

            //Display the records in sorted manner (sorted by name)
            Collections.sort(studArr);

            for(Student s : studArr){
                System.out.println("Student ID: " + s.getStudId());
                System.out.println("Student Name: " + s.getStudName());
                System.out.println("Student Address: " + s.getStudAddress());
                System.out.println("Student Department: " + s.getDepartments());
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
