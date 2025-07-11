package Aufin;

import java.sql.*;

public class JDBCTransaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "I2s32004$$";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);

            String q = "INSERT INTO student VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, 101); ps.setString(2, "Arjun"); ps.setInt(3, 20);
            ps.executeUpdate();

            ps.setInt(1, 102); ps.setString(2, "Zara"); ps.setInt(3, 21);
            ps.executeUpdate();

            con.commit();
            System.out.println("Transaction committed.");
            con.close();
        } catch (Exception e) {
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                con.rollback();
                System.out.println("Transaction rolled back.");
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
