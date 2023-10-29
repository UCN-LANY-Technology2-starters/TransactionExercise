package exercises;

import dataContext.Database;

public class Exercise6 extends Exercise { // Exercise 6: Pessimistic Concurrency Control

	public Exercise6(Database database) {
		super(database);
	}

	@Override
	public void run() {

		Thread t1 = new Thread(new T1(), "T1");
		Thread t2 = new Thread(new T2(), "T2");

		t1.start();
		t2.start();
	}

	class T1 implements Runnable {

		@Override
		public void run() {
			// TODO Implement transaction 1 – Transfer Money
			// 1. Read the balance from account 1 and 2
		    // 2. Withdraw $100 from account 1
			// 3. Deposit the $100 in account 2
			
			
		}
	}

	class T2 implements Runnable {

		@Override
		public void run() {
			// TODO Implement transaction 2 – Add Interest
			// 1. Read the balance from account 1 and 3
			// 2. Withdraw $100 from account 1
			// 3. Deposit the $100 in account 3
 
			
		}
	}
}
