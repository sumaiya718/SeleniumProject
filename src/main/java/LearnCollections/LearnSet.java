package LearnCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  //HashSet maintains random order
      /*  Set<String> names = new HashSet<String>();
        
        names.add("Sumaiya");
        names.add("Awsaf");
        names.add("Abc");
        names.add("Xyz");
        names.add("Ijk");
        
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
        
        System.out.println(names.contains("Awsaf"));
        
        System.out.println("----------------------------------------------");
        
        names.clear();
        
        System.out.println(names.isEmpty()); */
        
		//TreeSet maintains ascending order
       /* Set<Integer> num = new TreeSet<Integer>();
        
        num.add(11);
        num.add(15);
        num.add(12);
        num.add(11);
        num.add(13);
        
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
