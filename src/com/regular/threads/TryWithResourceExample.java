package com.regular.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Connections are closed in finally block
 * try-with-resources statement ensures that each resource is closed at the end of the statement execution.
 * 
 */  
public class TryWithResourceExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = 0;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			num = Integer.parseInt(br.readLine());
			System.out.println(num);
		}
		
	}

}
