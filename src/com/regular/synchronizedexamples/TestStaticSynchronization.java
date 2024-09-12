package com.regular.synchronizedexamples;
/**
 * If you make any static method as synchronized, 
 * the lock will be on the class not on object. 
 */
class MyThread111 extends Thread{    
	public void run(){    
		Table2.printTable(1);    
	}    
}    
class MyThread211 extends Thread{    
	public void run(){    
		Table2.printTable(10);    
	}    
}    
class MyThread311 extends Thread{    
	public void run(){    
		Table2.printTable(100);    
	}    
}    
class MyThread411 extends Thread{    
	public void run(){    
		Table2.printTable(1000);    
	}    
}    
public class TestStaticSynchronization {
	public static void main(String t[]){    
		MyThread111 t1=new MyThread111();    
		MyThread211 t2=new MyThread211();    
		MyThread311 t3=new MyThread311();    
		MyThread411 t4=new MyThread411();    
		t1.start();    
		t2.start();    
		t3.start();    
		t4.start();    
	}    
}    