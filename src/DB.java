import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clickbook","mathieumarin","h*h[PTuHc!2y36q");
        }catch(Exception e){System.out.println(e.getMessage());}
        return con;
    }

}