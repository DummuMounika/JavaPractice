package com.regular.practise;

import java.io.IOException;

class M {
	public void method() throws IOException{
		// If exception does not occur
		//System.out.println("device operation performed");
		// If exception occur
		throw new IOException("device error");
	}
}
public class TestThrows {

	public static void main(String[] args) throws IOException{
		M m = new M();
		m.method();
		System.out.println("normal flow...");

	}

}
