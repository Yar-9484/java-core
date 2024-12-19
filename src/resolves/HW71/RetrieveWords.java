package resolves.HW71;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrieveWords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "Yar";
        String password = "0011";

        List<String> wordList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String sql = "SELECT value FROM Word";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                wordList.add(rs.getString("value"));
            }
            System.out.println("Words retrieved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ви можете вивести список для перевірки
        System.out.println(wordList);
    }
}
