package com.regular;
class Calculator1{
	
	public int add(int n1,int n2)
	{
		System.out.println("111 only 2 int's");
		return n1 + n2;
	}
	
	public int add(int n1,int n2,int n3)
	{
		System.out.println("22  only 3 int's");
		return n1 + n2 + n3;
	}
	public double add(double n1, int n2)
	{
		System.out.println("33  only 1 int and 1 double");
		return n1 + n2;
	}
	public float add(float n1, int n2)
	{
		System.out.println("44  only 1 float and 1 int");
		return n1 + n2;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		int r1 = obj.add(23, 7);
		int r2 = obj.add(2, 6, 8);
		double r3 = obj.add(200.987,600000); // double 
		float r4 = obj.add(200.987f, 87); //float
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

}
