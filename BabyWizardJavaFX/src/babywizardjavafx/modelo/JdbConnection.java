/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babywizardjavafx.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import babywizardjavafx.BabyWizardJavaFX;

/**
 *String jdbcURL = "jdbc:mysql://localhost:7050/babywizard?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "Ps1c0LabeS4v3r2";
 * @author Vicaris
 */
public class JdbConnection {
    @SuppressWarnings("CallToPrintStackTrace")
    public Connection getConnection() {
		String jdbcURL = "jdbc:mysql://localhost:7050/babywizard?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "Ps1c0LabeS4v3r2";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(jdbcURL, username, password);		
		} catch(ClassNotFoundException | SQLException e) {
                        
			e.printStackTrace();
		}
		return con;
	}
}
