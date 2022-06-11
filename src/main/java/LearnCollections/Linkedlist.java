package LearnCollections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new LinkedList<String>();
		names.add("Wadud");
		names.add("Sumayia");
		names.add("Touhid");
		names.add("Daisy");
		names.add("Tushar");
		System.out.println(names);
		
		//Get the count of the list System.out.println(lst.size());
		  System.out.println("...............................................");
		  
		  names.add("Jony"); 
		  System.out.println(names.size());
		  System.out.println("...............................................");
		  
		  //Print all items inside the list 
		  for(String eachNames : names) { 
			  System.out.println(eachNames);
		  
		  }
		  
		  System.out.println("...............................................");
		  //Delete the item from the list- names.remove(0);
		  names.remove(1);
		  //again Print all items inside the list
		  
		  for(String eachNames : names) { 
			  System.out.println(eachNames);
		  
		  } 
		  System.out.println("...............................................");
		  
		  System.out.println(names.contains("abc"));
		  
		  System.out.println("...............................................");
		  
		  System.out.println(names.contains("Daisy"));
		  
		  System.out.println("...............................................");
		  names.clear();
		  
		  System.out.println(names.isEmpty());
		  System.out.println("...............................................");
		 
	}

}
