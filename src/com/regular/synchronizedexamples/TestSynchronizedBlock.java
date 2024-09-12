package com.regular.synchronizedexamples;
/**
 * Synchronized block can be used to perform synchronization on any specific resource of the method.
 */

public class TestSynchronizedBlock {
	public static void main(String[] args) {
		Sender sender = new Sender();
		SenderWithThreads sender1 = new SenderWithThreads("HI From Monu!", sender);
		SenderWithThreads sender2 = new SenderWithThreads("HI From Venu!", sender);
		sender1.start();
		sender2.start();
		
		try {
			sender1.join();
			sender2.join();
		}catch(Exception e) {
			System.out.println("Interrupted");
		}
	}

}
