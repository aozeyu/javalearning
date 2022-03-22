package com.atguigu.demo.Autobox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mysqlstudy";
        Connection conn = null;
        int rollno = 2;
        String name = "Jane";
        int age = 22;

        String sql = "insert into student(rollno,name,age) " + "values("+ rollno + ",'" + name +"'," +age +")";

        try {
            conn = DriverManager.getConnection(url,"safdar","safdar");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("inserted successfully: " + sql);
            }else {
                System.out.println("insertion failed");
            }
        } catch (Exception ex) {
           System.err.println(ex);
        }finally {
            conn.close();
        }
    }
}
