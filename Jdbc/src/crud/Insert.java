package crud;
import java.sql.*;
public class Insert {
	public static void main(String[] args) throws Exception{
		String query = "insert into stud values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vidyalay","root","sri08#fitness");
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, 1143);
		st.setString(2, "Mayank");
		int count = st.executeUpdate();
		System.out.println(count+" row/s affected");
		st.close();
		con.close();
	}
}
