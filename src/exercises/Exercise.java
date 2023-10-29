package exercises;

import dataContext.Database;

public abstract class Exercise {
	
	protected Database database;

	public Exercise(Database database) {
		
		this.database = database;			
	}
	
	public abstract void run();
}
