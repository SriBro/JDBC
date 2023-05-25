package crud;
import java.sql.*;
public class Delete {
	public static void main(String[] args) throws Exception{
		String query = "delete from stud where student_rollno=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vidyalay","root","sri08#fitness");
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,1141);
		int count = st.executeUpdate();
		System.out.println(count+" row/s deleted");
		st.close();
		con.close();
	}
}
