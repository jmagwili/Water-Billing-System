
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;


public class Database {
    ImageIcon image;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Database(){
        connection();
    }
    
    private void connection(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://src\\Aquafinity.accdb");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
