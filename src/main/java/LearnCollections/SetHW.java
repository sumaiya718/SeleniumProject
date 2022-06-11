package LearnCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
		  //HashSet maintains random order
	        /*Set<String> names = new HashSet<String>();
	        
	        names.add("Sumaiya");
	        names.add("Ijk");
	        names.add("Abc");
	        names.add("Xyz");
	        names.add("Zahed");
	        names.add("Daisy");
	        names.add("Mamun");
	        names.add("Tushar");
	        names.add("Wadud");
	        names.add("Sayed");
	        names.add("Shakil");
	        names.add("Touhid");
	        names.add("Harun");
	        names.add("Sumit");
	        names.add("Bipul");
	   
	             
	        for(String eachNames : names) {
	        System.out.println(eachNames);
	        }
	        System.out.println("----------------------------------------------");
	        
	        System.out.println(names);
	        
	        System.out.println("----------------------------------------------");
	        
	        System.out.println(names.size());
	        
	        System.out.println("----------------------------------------------");
	        
	        names.remove("Ijk");
	        
	        System.out.println(names);
	        
	        System.out.println("----------------------------------------------");
	        
	        System.out.println(names.contains("Zahed"));
	        
	        System.out.println("----------------------------------------------");
	        
	        names.clear();
	        
	        System.out.println(names.isEmpty()); */
	        
			//TreeSet maintains ascending order
	        /*Set<Integer> num = new TreeSet<Integer>();
	        
	        num.add(11);
	        num.add(15);
	        num.add(12);
	        num.add(11);
	        num.add(13);
	        num.add(14);
	        num.add(16);
	        num.add(17);
	        num.add(18);
	        num.add(19);
	        num.add(21);
	        num.add(25);
	        num.add(22);
	        num.add(24);
	        num.add(23);
	        
	        System.out.println(num);
	        
	        System.out.println("----------------------------------------------");
	        
	        for(int eachNum : num)
	        {
	        	System.out.println(eachNum);
	        }
	        
	        System.out.println("----------------------------------------------");
	        
	        System.out.println(num.size());
	        
	        System.out.println("----------------------------------------------");
	        
	        num.remove(11);
	        
	        System.out.println(num);
	        
	        System.out.println("----------------------------------------------");
	        
	        System.out.println(num.contains(11));
	        
	        System.out.println("----------------------------------------------");
	        
	        num.clear();
	        
	        System.out.println(num.isEmpty()); */
			
			//LinkedHashSet maintains inserting order
			Set <Integer> id = new LinkedHashSet<Integer>();
			
			id.add(101);
			id.add(102);
			id.add(105);
			id.add(101);
			id.add(103);
			id.add(104);
			id.add(106);
			id.add(107);
			id.add(108);
			id.add(109);
			id.add(201);
			id.add(202);
			id.add(205);
			id.add(201);
			id.add(203);
			
			System.out.println(id);
			
			System.out.println("----------------------------------------------");
			
			for(int eachId : id)
			{
				System.out.println(eachId);
			}
			
			System.out.println("----------------------------------------------");
			
			System.out.println(id.contains(101));
			
			System.out.println("----------------------------------------------");
			
			id.remove(101);
			
			System.out.println(id);
			
			System.out.println("----------------------------------------------");
			
			id.clear();
			
			System.out.println(id.isEmpty());
		
		   

	
	}
}
