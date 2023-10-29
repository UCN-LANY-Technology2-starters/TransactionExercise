import dataContext.SqlServerDatabase;
import exercises.*;

public class Program {

	public static void main(String[] args) {

		SqlServerDatabase database = new SqlServerDatabase();

		// TODO: Comment/Uncomment below when working with specific exercise.

		// Exercise 1: Atomic Bank Transfer
		Exercise1 ex1 = new Exercise1(database);
		ex1.run();

		// Exercise 2: Atomic Account Creation
//		Exercise2 ex2 = new Exercise2(database);
//		ex2.run();

		// Exercise 3: Consistent Account Update
//		Exercise3 ex3 = new Exercise3(database);
//		ex3.run();

		// Exercise 4: Atomic Account Deletion
//		Exercise4 ex4 = new Exercise4(database);
//		ex4.run();

		// Exercise 5: Consistent Minimum Balance
//		Exercise5 ex5 = new Exercise5(database);
//		ex5.run();
		
		// Exercise 6: Pessimistic Concurrency Control 
//		Exercise6 ex6 = new Exercise6(database);
//		ex6.run();
		
		// Exercise 7: Optimistic Concurrency Control
//		Exercise7 ex7 = new Exercise7(database);
//		ex7.run();
		
		// Exercise 8: Deadlock
//		Exercise8 ex8 = new Exercise8(database);
//		ex7.run();
	}
}
