package dataContext;

import java.sql.Connection;

public abstract class Database {

	public abstract Connection getConnection();
	public abstract Connection getConnection(int isolationLevel);
}
