package com.regular;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//	}
		//Traversing the list of elements in reverse order  
        Iterator i=al.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        
        //Creating list of Books  
        List <Book> list = new LinkedList<Book>();
        //creating books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list  
        list.add(b1);  
        list.add(b2);  
        list.add(b3);  
        //Traversing list  
        for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
	}

}
