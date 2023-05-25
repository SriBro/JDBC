package crud;
import java.sql.*;
public class Update {
			public static void main(String[] args) throws Exception{
				String query = "update stud set student_name=? where student_rollno=?";
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vidyalay","root","sri08#fitness");
				PreparedStatement st = con.prepareStatement(query);
				st.setInt(2,1138);
				st.setString(1,"Nawz");
				int count = st.executeUpdate();
				System.out.println(count+" row/s updated");
				st.close();
				con.close();
			}

	}

