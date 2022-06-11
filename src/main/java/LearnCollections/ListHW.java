package LearnCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* List<String> empName = new ArrayList<String>();
		
        empName.add("Sumaiya");
        empName.add("Daisy");
        empName.add("Mamun");
        empName.add("Tushar");
        empName.add("Wadud");
        empName.add("Sayed");
        empName.add("ABC");
        empName.add("XYZ");
        empName.add("IJK");
        empName.add("Sumaiya");
        
        System.out.println(empName);
        
        System.out.println("----------------------------------------------");
        
        for(String eachEmpName : empName) 
        {
        	System.out.println(eachEmpName);
        }
        
        System.out.println("----------------------------------------------");
        
        System.out.println(empName.size());
        
        System.out.println("----------------------------------------------");
        
        System.out.println(empName.get(2));
        
        System.out.println("----------------------------------------------");
        
        empName.remove(0);
        
        System.out.println(empName);
        
        System.out.println("----------------------------------------------");
        
        System.out.println(empName.contains("IJK"));
        
        System.out.println("----------------------------------------------");
        
        empName.clear();
        
        System.out.println(empName.isEmpty());
        
        System.out.println("----------------------------------------------"); */
        
        
       /* List<Integer> empId = new ArrayList<Integer>();
        
        empId.add(10);
        empId.add(11);
        empId.add(12);
        empId.add(13);
        empId.add(14);
        empId.add(15);
        empId.add(15);
        empId.add(16);
        empId.add(17);
        empId.add(18);
        
        System.out.println(empId);
        
        System.out.println("----------------------------------------------");
        
        for(int i=0; i<empId.size(); i++)
        	
        {
        	System.out.println(empId.get(i));
        }
        
        System.out.println("----------------------------------------------");
        
        empId.remove(8);
        
        System.out.println(empId.contains(17));
        
        System.out.println("----------------------------------------------");
        
        empId.clear();
        
        System.out.println(empId.isEmpty());
        
        System.out.println("----------------------------------------------"); */
		
		List<String> name = new LinkedList<String>();
		
		name.add("ABC");
		name.add("XYZ");
		name.add("Mamun");
		name.add("Harun");
		name.add("Daizy");
		name.add("ABC");
		name.add("Sumaiya");
		name.add("Tushar");
		name.add("Sumaiya");
		name.add("ABC");
		
		System.out.println(name);
        
		System.out.println("----------------------------------------------");
		
		System.out.println(name.size());
		
		System.out.println("----------------------------------------------");
	
	    for(int i=0; i<name.size(); i++) 
	    {
	      System.out.println(name.get(i));	
	    }
	
	    System.out.println("----------------------------------------------");
	    
	    name.remove(4);
	    
	    System.out.println(name.contains("Daizy"));
	    
	    System.out.println("----------------------------------------------");
	    
	    name.clear();
	    
	    System.out.println(name.isEmpty());
	    
       List<Integer> Id = new LinkedList<Integer>();
        
        Id.add(20);
        Id.add(21);
        Id.add(22);
        Id.add(23);
        Id.add(24);
        Id.add(25);
        Id.add(27);
        Id.add(26);
        Id.add(27);
        Id.add(28);
        
        System.out.println(Id);
        
        System.out.println("----------------------------------------------");
        
        for(Integer eachId : Id)
        	
        {
        	System.out.println(eachId);
        }
        
        System.out.println("----------------------------------------------");
        
        Id.remove(8);
        
        System.out.println(Id.contains(28));
        
        System.out.println("----------------------------------------------");
        
        Id.clear();
        
        System.out.println(Id.isEmpty());
        
        System.out.println("----------------------------------------------"); 
	    
	}

}

