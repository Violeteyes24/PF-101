import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*; // for gui, usually Jlabel, Jtexfield, access to its built in methods
import java.awt.event.*; // Action Listener
import java.awt.*; // font, maint font and color
import java.sql.ResultSet;

public class create_db {
    String url = "jdbc:mysql://localhost:3306/mydatabase";
    String user = "root";
    String password = "";

    Statement statement;

    public void DatabaseConnect() {
        // function to connect to the xampp server
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javafx", "root", "");
            statement = conn.createStatement();
            System.out.print("Database Connected");
        } catch (Exception e) {
            System.out.print("Database Not Connected");
        }
    }

    public static void main(String[] args) {

        create_db db_conn = new create_db();
        db_conn.DatabaseConnect();

    }
}
