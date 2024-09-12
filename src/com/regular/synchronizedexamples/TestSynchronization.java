package com.regular.synchronizedexamples;
/**
 * When a thread invokes a synchronized method,
 *  it automatically acquires the lock for that object 
 * and releases it when the thread completes its task.
 */
class Table1{
	public synchronized void printTable(int n) { //method not synchronized
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(20);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread11 extends Thread {
	Table1 t;
	MyThread11(Table1 t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
	
}

class MyThread21 extends Thread {
	Table1 t;
	MyThread21(Table1 t){
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
	
}
public class TestSynchronization {
	public static void main(String[] args) {
		Table1 obj = new Table1();
		MyThread11 t1 = new MyThread11(obj);
		MyThread21 t2 = new MyThread21(obj);
		t1.start();
		t2.start();
		
	}

}
