package feb08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/nations";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		/*String query1 = ""
				+ "select c.name as \"country\", c.country_id as \"id\" , r.name as \"region\", c2.name as \"continent\" \r\n"
				+ "from countries c\r\n"
				+ "inner join regions r \r\n"
				+ "on c.region_id = r.region_id \r\n"
				+ "inner join continents c2\r\n"
				+ "on r.continent_id = c2.continent_id \r\n"
				+ "order by c.name;";

		
		PreparedStatement pstmt = con.prepareStatement(query1);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
		  System.out.println(rs.getString("country") + " " + rs.getString("id") + " " + rs.getString("region") + " " + rs.getString("continent"));
		} */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci una stringa di ricerca: ");
		String search = sc.nextLine();
		sc.close();
		
		 String query2 = ""
					+ "select c.name as \"country\", c.country_id as \"id\" , r.name as \"region\", c2.name as \"continent\" \r\n"
					+ "from countries c\r\n"
					+ "inner join regions r \r\n"
					+ "on c.region_id = r.region_id \r\n"
					+ "inner join continents c2\r\n"
					+ "on r.continent_id = c2.continent_id \r\n"
					+ "WHERE c.name LIKE ?\r\n"
					+ "order by c.name;";

		PreparedStatement pstmt2 = con.prepareStatement(query2);
		pstmt2.setString(1, "%" + search + "%");
		ResultSet rs1 = pstmt2.executeQuery();

		while (rs1.next()) {
			  System.out.println(rs1.getString("country") + " " + rs1.getString("id") + " " + rs1.getString("region") + " " + rs1.getString("continent"));
			} 
		
	}

}
