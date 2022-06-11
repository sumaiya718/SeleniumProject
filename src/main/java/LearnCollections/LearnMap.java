package LearnCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map is 2 Dimensional
		
		//HashMap maintains random order
        /*Map<String,Integer> mp = new HashMap<String,Integer>();
        
        mp.put("Sumaiya", 101);
        mp.put("Awsaf", 102);
        mp.put("Abc", 104);
        mp.put("Xyz", 103);
        mp.put("Abc",105 );
        mp.put("Ijk", 105);
        
        System.out.println(mp);
        
        System.out.println("----------------------------------------------");
        
        for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	
        	System.out.println(eachMp.getKey()+ "     "+ eachMp.getValue());
        	
        }
        System.out.println("----------------------------------------------");
        
        System.out.println(mp.size());
        
        System.out.println("----------------------------------------------");
        
        System.out.println(mp.get("Awsaf"));
        
        System.out.println("----------------------------------------------");
        
        mp.remove("Abc");
        
        System.out.println(mp.entrySet());
        
        System.out.println("----------------------------------------------");
        
        System.out.println(mp.containsKey("Xyz"));
        System.out.println(mp.containsValue(106));
        
        System.out.println("----------------------------------------------");
        
        mp.clear();
        
        System.out.println(mp.isEmpty()); */
		
		//TreeMap maintains ascending order
	    /*Map<String,Integer> mp1 = new TreeMap<String,Integer>();
		
		mp1.put("Sumaiya", 101);
		mp1.put("Awsaf", 102);
        mp1.put("Abc", 104);
        mp1.put("Xyz", 103);
        mp1.put("Abc",105 );
        mp1.put("Ijk", 105);
        
        for(Entry<String,Integer> eachMp1 : mp1.entrySet())
        {
        	System.out.println(eachMp1.getKey()+"     "+eachMp1.getValue());
        }
        System.out.println("----------------------------------------------");
        
        System.out.println(mp1.size());
        
        System.out.println("----------------------------------------------");
        
        System.out.println(mp1.get("Awsaf"));
        
        System.out.println("----------------------------------------------");
        
        mp1.remove("Xyz");
        
        System.out.println(mp1.entrySet());
        
        System.out.println("----------------------------------------------");
        
        System.out.println(mp1.containsKey("Xyz"));
        System.out.println(mp1.containsValue(105));
        
        System.out.println("----------------------------------------------");
        
        mp1.clear();
        
        System.out.println(mp1.isEmpty()); */
		
		//LinkedHashMap maintains inserting order
		Map<Integer,Integer> mp2 = new LinkedHashMap<Integer,Integer>();
		
		mp2.put(101,11);
		mp2.put(102,12);
		mp2.put(100,13);
		mp2.put(101,14);
		mp2.put(104,12);
		mp2.put(105,15);
		
		for(Entry<Integer,Integer> eachMp2 : mp2.entrySet()) 
		{
			System.out.println(eachMp2.getKey()+"     "+eachMp2.getValue());
		}
        
		System.out.println("----------------------------------------------");
		
		System.out.println(mp2.get(101));
		
		System.out.println("----------------------------------------------");
		
		mp2.remove(100);
		
		System.out.println(mp2.entrySet());
		
		System.out.println("----------------------------------------------");
		
		System.out.println(mp2.containsKey(100));
		System.out.println(mp2.containsValue(11)); //False, Bcoz 101 is assigned to 14. Old value is overwritten with new value.
		
		System.out.println("----------------------------------------------");
		
		mp2.clear();
		
		System.out.println(mp2.isEmpty());
	}

}
