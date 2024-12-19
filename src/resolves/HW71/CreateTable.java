package resolves.HW71;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "Yar";
        String password = "0011";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE Word (id INT AUTO_INCREMENT, value VARCHAR(255), PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

