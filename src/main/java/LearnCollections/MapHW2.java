package LearnCollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mp2 = new LinkedHashMap<String,String>();
		
		mp2.put("Sumaiya","Chowdhury");
        mp2.put("Mahbuba","Daisy");
        mp2.put("Bepul","Rahman");
        mp2.put("Harun","Chy");
        mp2.put("Touhid","Chy" );
        mp2.put("Sumaiya", "Fahmida");
        mp2.put("Abc","Xyz");
        mp2.put("Xyz","Abc");
        mp2.put("Farha","Runi");
        mp2.put("Anjum","Ahmed");
       
		
		for(Entry<String,String> eachMp2 : mp2.entrySet()) 
		{
			System.out.println(eachMp2.getKey()+"     "+eachMp2.getValue());
		}
        
		System.out.println("----------------------------------------------");
		
		System.out.println(mp2.get("Sumaiya"));
		
		System.out.println("----------------------------------------------");
		
		mp2.remove("Xyz");
		
		System.out.println(mp2.entrySet());
		
		System.out.println("----------------------------------------------");
		
		System.out.println(mp2.containsKey("Abc"));
		System.out.println(mp2.containsValue("Chy")); 
		
		System.out.println("----------------------------------------------");
		
		mp2.clear();
		
		System.out.println(mp2.isEmpty()); 


	}

}
