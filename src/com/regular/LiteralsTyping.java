package com.regular;

public class LiteralsTyping {
	
	public static void main(String args[]) {
		
		//literals
		
		int num1 = 0b101; //binary number
		System.out.println(num1);
		int num2 = 0x7E; //hexa number
		System.out.println(num2);
		int num3 = 10_00_00_000;
		System.out.println(num3);
		double num4 = 12e10;
		System.out.println(num4);
		char ch = 'a';
		ch ++;
		System.out.println(ch);
		
		
		
		
		//Type casting
		byte b = 127;
		int a = b;
		
		int c = 257;
		byte k = (byte) c;
		
		float f = 9.7f;
		int t = (int) f;
		
		
        System.out.println(a);
		System.out.println(c);
     	System.out.println(t);
		
		//Type promotion
		
		byte z = 10;
		byte y = 30;
		//byte is out of range(127)
		//so we are prompting to integer type
	    int result = z * y;
	    
	    System.out.println(result);
	    
		
	}

}
