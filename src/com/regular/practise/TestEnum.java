package com.regular.practise;
//Enums are named constants that can be used to 
//represent a set of related values.
//Example- the response code
public class TestEnum {

	public static void main(String[] args) {
		
		//TestStatus s = TestStatus.Success;
		TestStatus[] testStatus = TestStatus.values();
		
		for(TestStatus ts: testStatus) {
			//ordinal() method, which returns the index of the constant within the enum.
			System.out.println(ts + " : " + ts.ordinal());
		}
		
		
//		If-else
		TestStatus s = TestStatus.Running;
		
//		if (s == TestStatus.Running)
//			System.out.println("All good");
//		else if(s == TestStatus.Failed)
//			System.out.println("Try Again");
//		else if(s == TestStatus.Pending)
//			System.out.println("Please Wait");
//		else
//			System.out.println("Done");  
		
        //Switch-Case	
		switch(s) {
			case Running:
				System.out.println("All good"); 
				break;
			case Failed:
				System.out.println("Try Again"); 
				break;
			case Pending:
				System.out.println("Please Wait"); 
				break;
			default:
				System.out.println("Done"); 				
	     }
		
		 for(Laptop lap: Laptop.values()){
			 System.out.println(lap + ":" +lap.getPrice()+ " "+ lap.calculatePrice2());
		 }

} 
}
