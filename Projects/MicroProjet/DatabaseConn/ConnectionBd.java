package DatabaseConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBd {

	public static Connection GetConnecttion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_cm", "root", "");
			System.out.println("Base de donnees connectee avec succes!!");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
