package com.regular.synchronizedexamples;

public class Sender {
	public void SenderMsg(String msg) {
		System.out.println("\nSending a Message: "+msg);
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println("Thread interupted");
		}
		System.out.println("\n"+msg+"sent");
	}

}
