package exercises;

import dataContext.Database;

public class Exercise7 extends Exercise { // Exercise 7: Optimistic Concurrency Control

	public Exercise7(Database database) {
		super(database);
	}

	@Override
	public void run() {
		
		Thread t1 = new Thread(new T1(), "T1");
		Thread t2 = new Thread(new T2(), "T2");

		t1.start();
		t2.start();
	}
	
	class T1 implements Runnable{

		@Override
		public void run() {
			// TODO Implement transaction 1– Close Account
			// 1. Read the balance from account 1
			// 2. Set account 1 balance to zero
			// 3. Deposit the amount read from account 1 in account 2

			
		}		
	}

	class T2 implements Runnable{

		@Override
		public void run() {
			// TODO Transaction 2 – Add Interest
			// 1. Read the balance from account 1
			// 2. Add an interest amount of 10% to account 1

			
		}		
	}
}
