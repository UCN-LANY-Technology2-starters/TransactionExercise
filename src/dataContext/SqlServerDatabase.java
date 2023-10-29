package dataContext;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class SqlServerDatabase extends Database {

	public SqlServerDatabase() {

	}

	public Connection getConnection() {

		try {
			// TODO: Change the values below to connect to your instance of SQL Server

			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setUser("sa");
			ds.setPassword("P@$$w0rd");
			ds.setServerName("192.168.56.101"); // TODO: Set this to the IP-address of the machine running the SQL Server
			ds.setDatabaseName("TransactionExercises");

			return ds.getConnection();

		} catch (SQLServerException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Connection getConnection(int isolationLevel) {

		try {
			Connection conn = getConnection();
			conn.setTransactionIsolation(isolationLevel);
			
			return conn;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
}
