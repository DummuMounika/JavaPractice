package com.revising.oopsconcept;

public class InheritanceTypes {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.area();
		Circle c1 = new Circle();
		c1.area(2);
		Triangle t1 = new Triangle();
		t1.area(10, 20);
		EquivalateralTriangle t2 = new EquivalateralTriangle();
		t2.area(10, 20);
	}

}
