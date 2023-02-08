package feb08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/nations";
		String username = "root";
		String password = "root";
		
		String qwery1 = ""
				+ "select c.name as \"country\", c.country_id as \"id\" , r.name as \"region\", c2.name as \"continent\" \r\n"
				+ "from countries c\r\n"
				+ "inner join regions r \r\n"
				+ "on c.region_id = r.region_id \r\n"
				+ "inner join continents c2\r\n"
				+ "on r.continent_id = c2.continent_id \r\n"
				+ "order by c.name;";

		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt = con.prepareStatement(qwery1);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
		  System.out.println(rs.getString("country") + " " + rs.getString("id") + " " + rs.getString("region") + " " + rs.getString("continent"));
		}
	}

}
