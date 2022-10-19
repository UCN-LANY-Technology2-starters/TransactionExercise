package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class DataContext {

	public static Connection getConnection() throws SQLServerException {

		// TODO: Change the values below to connect to another instance of SQL Server

		SQLServerDataSource ds = new SQLServerDataSource();
		ds.setUser("student");
		ds.setPassword("P@$$w0rd");
		ds.setServerName("localhost\\sqlexpress");
		ds.setDatabaseName("TransactionExercises");
		return ds.getConnection();
	}

	public static Connection getConnection(int isolationLevel) throws SQLException {

		Connection conn = getConnection();
		conn.setTransactionIsolation(isolationLevel);
		return conn;
	}

	public static void printSessionInfo(Connection conn) {

		PreparedStatement selectSessionInfo = null;

		try {
			selectSessionInfo = conn.prepareStatement("select @@SPID");
			ResultSet sessionInfoRows = selectSessionInfo.executeQuery();
			sessionInfoRows.next();
			System.out.println(Thread.currentThread().getName() + " - Session: " + sessionInfoRows.getInt(1)
					+ ", IsolationLevel: " + conn.getTransactionIsolation());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void resetDatabase() {
		String sql = "UPDATE Account SET Balance = 100 WHERE Id = 1; "
				+ "UPDATE Account SET Balance = 200 WHERE Id = 2; "
				+ "UPDATE Account SET Balance = 300 WHERE Id = 3; "
				+ "UPDATE Users Set Age = 20 WHERE Id = 1; "
				+ "DELETE FROM Users WHERE Id > 2";
		
		try {
			
			Connection conn = getConnection();
			Statement resetStatement = conn.createStatement();
			resetStatement.execute(sql);

		} catch (SQLServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
