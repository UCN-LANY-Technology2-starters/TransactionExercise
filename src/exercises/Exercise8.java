package exercises;

import dataContext.Database;

public class Exercise8 extends Exercise { // Exercise 8: Deadlock 

	public Exercise8(Database database) {
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
			// TODO Implement Transaction 1 – Create Account
			// 1. Read the balance from accounts of type A
			// 2. Create a new account of type B with that balance
			
		}
	}

	class T2 implements Runnable {

		@Override
		public void run() {
			// TODO Implement Transaction 2 – Create Account
			// 1. Read the balance from accounts of type B
			// 2. Create a new account of type A with that balance 
			
		}
	}
}
