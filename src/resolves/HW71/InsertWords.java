package resolves.HW71;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "Yar";
        String password = "0011";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Word (value) VALUES (?)")) {
            String[] words = {"Hello", "World", "JDBC", "Java"};
            for (String word : words) {
                pstmt.setString(1, word);
                pstmt.executeUpdate();
            }
            System.out.println("Words inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
