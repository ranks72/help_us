
package otomotive;
import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi_saya {
    //function to connect mysql
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/penjualan_motor", "root", "");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
