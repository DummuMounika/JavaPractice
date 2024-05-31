package com.regular;
class Student{
	int rollno ;
	String name;
	int marks;
}
public class ArraysOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Mounika";
		s1.marks = 98;
		
		Student s2 = new Student();
		s2.rollno = 3;
		s2.name = "Venu";
		s2.marks = 88;
		
		Student s3 = new Student();
		s3.rollno = 4;
		s3.name = "Navin";
		s3.marks = 78;
		
		Student stds[] = new Student[3];
		stds[0] = s1;
		stds[1] = s2;
		stds[2] = s3;
		
//		for(int i=0;i<stds.length;i++) {
//			//System.out.println(stds[i].rollno + ":" + stds[i].name + "=" + stds[i].marks);
//		    
//		}
		
		for(Student n : stds) {
			System.out.println(n.name +":"+ n.marks);
		}
		
		
	}

}
