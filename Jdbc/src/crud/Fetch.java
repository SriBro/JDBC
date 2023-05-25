package crud;
import java.sql.*;
public class Fetch {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/vidyalay";
		String user = "root";
		String pass = "sri08#fitness";
		String query = "select * from stud";
		//1.Loading driver'
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Create connections
		Connection con = DriverManager.getConnection(url,user,pass);
		//3.Create statements
		Statement st = con.createStatement();
		//4.Execute Query
		ResultSet rs = st.executeQuery(query);
		 while(rs.next()) {
			  System.out.println(rs.getString("student_rollno")+" "+rs.getString(
			  "student_name")); 
			  }
		 //5.Closing connections
		st.close();
		con.close();
	}
}
