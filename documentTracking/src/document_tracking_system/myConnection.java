package document_tracking_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class myConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/document_tracking?useSSL=false&allowMultiQueries=true&serverTimezone=UTC", "root", "gourab99");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
