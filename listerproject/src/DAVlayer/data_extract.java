package DAVlayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import UserDetails.User_ip;
public class data_extract{
	public void data_extract(long ph) {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busTicket","root","0608");
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Userip where phn_number="+ph);  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getLong(2)+"  "+rs.getString(3));  
		con.close();  
		}
		catch(Exception e){ 
			System.out.println(e);}
     }


}
