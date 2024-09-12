package com.regular.practise;
class MounikaException extends RuntimeException
{
	public MounikaException(String string) {
		super(string);
	}
}
public class TestThrow {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		
		try
		{
			throw new MounikaException(" I don't wanna print");
		}
		catch(ArithmeticException e) {
			j = 18/1;
			System.out.println("that's the default output" + e);
		}catch(Exception e) {
			System.out.println("Something went wrong. " + e);
		}
		
		System.out.println(j);
		System.out.println("Bye");

	}

}
