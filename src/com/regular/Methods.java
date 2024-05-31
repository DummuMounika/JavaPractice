package com.regular;
class Computer{
	public void playMusic() //no return value
	{
		System.out.println("Music Playing..");
	}
	public String getMePen(int cost) //return type should be mentioned
	{
		if (cost >=10)	
			return "Pen";
		else
			return "Nothing";
	}
}
public class Methods {
	
	public static void main(String[] args) {
		Computer obj = new 	Computer(); //object
		obj.playMusic();
		String str = obj.getMePen(2);
		System.out.println(str);
	}

}
