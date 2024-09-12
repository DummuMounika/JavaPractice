package com.regular.threads;
/**
 * Thread is a process where the program can operate more efficiently by running mutiple task simultaneously.
 * Thread is class which implement Runnable
 */
class Counter {
	int count;
	public synchronized void increment() {
	//blic void increment() {
		count ++;
		
	}
}
class C extends Thread {
	public void run() {
		for (int i = 1;i<=5;i++) {
			System.out.println("This is Monu");
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Runnable obj1 = () ->
		{
				for(int i = 1;i<= 15;i++) {
					System.out.println("Hello");
					c1.increment();
					try {
						Thread.sleep(10);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("checking 1ount" +c1.count);
				}
			};
			
		Runnable obj2 =  () ->
		{
			for(int i = 1;i<= 15;i++) {
				System.out.println("Hi");
				c1.increment();
				try {
					Thread.sleep(10);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("checking 1unt" +c1.count);
				
			}
		
		};
		
		C obj3 = new C();
		
		System.out.println(obj3.getPriority());

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		System.out.println(t1.getState());
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		
//		try{    
//			t1.join(1500);    
//		}catch(Exception e){
//			System.out.println(e);
//		}  

		System.out.println(t1.getState());
		
		t2.start();
		
		System.out.println(t1.getState());
		System.out.println(obj3.isAlive());
		

	}

}
