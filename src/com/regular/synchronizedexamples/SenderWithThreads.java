package com.regular.synchronizedexamples;

public class SenderWithThreads extends Thread{
	private String msg;
	Sender sender;
	public SenderWithThreads(String msg,Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}
	public void run() {
		synchronized (sender) {
			sender.SenderMsg(msg);			
		}
	}
	
}
