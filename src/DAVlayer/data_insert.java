package DAVlayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class data_insert {
	public void data_insert(String k,String e,long ph) throws ClassNotFoundException {
		try
	    {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busTicket","root","0608");
            PreparedStatement pstmt = con.prepareStatement("insert into Userip(passengername,phn_number,email) values('"+k+"','"+ph+"','"+e+"');");
	        pstmt.executeUpdate();
	    }
	    catch (SQLException ex)
	    {	
	    } 
	}
}
