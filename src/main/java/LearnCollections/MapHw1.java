package LearnCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapHw1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
				//Map is 2 Dimensional
				
				//HashMap maintains random order
		        /*Map<String,String> mp = new HashMap<String,String>();
		        
		        mp.put("New York","NYC");
		        mp.put("Califronia","Los Angeles");
		        mp.put("Nevada","Las Vegas");
		        mp.put("Texas","Austin");
		        mp.put("Florida","Orlando" );
		        mp.put("Illinois", "Chicago");
		        mp.put("New Jersey","Trenton");
		        mp.put("Arizona","Tucson");
		        mp.put("Maine","Portland");
		        mp.put("New York","Buffalo");
		       
		        
		        
		        
		        System.out.println(mp);
		        
		        System.out.println("----------------------------------------------");
		        
		        for(Entry<String, String> eachMp : mp.entrySet()) {
		        	
		        	System.out.println(eachMp.getKey()+ "     "+ eachMp.getValue());
		        	
		        }
		        System.out.println("----------------------------------------------");
		        
		        System.out.println(mp.size());
		        
		        System.out.println("----------------------------------------------");
		        
		        System.out.println(mp.get("Florida"));
		        
		        System.out.println("----------------------------------------------");
		        
		        mp.remove("Texas");
		        
		        System.out.println(mp.entrySet());
		        
		        System.out.println("----------------------------------------------");
		        
		        System.out.println(mp.containsKey("Arizona"));
		        System.out.println(mp.containsValue("Buffalo"));
		        
		        System.out.println("----------------------------------------------");
		        
		        mp.clear();
		        
		        System.out.println(mp.isEmpty()); */
				
				//TreeMap maintains ascending order
			    /*Map<String,String> mp1 = new TreeMap<String,String>();
				
			    mp1.put("New York","NYC");
		        mp1.put("Califronia","Los Angeles");
		        mp1.put("Nevada","Las Vegas");
		        mp1.put("Texas","Austin");
		        mp1.put("Florida","Orlando" );
		        mp1.put("Illinois", "Chicago");
		        mp1.put("New Jersey","Trenton");
		        mp1.put("Arizona","Tucson");
		        mp1.put("Maine","Portland");
		        mp1.put("New York","Buffalo");
		        
		        for(Entry<String,String> eachMp1 : mp1.entrySet())
		        {
		        	System.out.println(eachMp1.getKey()+"     "+eachMp1.getValue());
		        }
		        System.out.println("----------------------------------------------");
		        
		        System.out.println(mp1.size());
		        
		        System.out.println("----------------------------------------------");
		        
		        System.out.println(mp1.get("New Jersey"));
		        
		        System.out.println("----------------------------------------------");
		        
		        mp1.remove("Nevada");
		        
		        System.out.println(mp1.entrySet());
		        
		        System.out.println("----------------------------------------------");
		        
		        System.out.println(mp1.containsKey("Michigan"));
		        System.out.println(mp1.containsValue("Orlando"));
		        
		        System.out.println("----------------------------------------------");
		        
		        mp1.clear();
		        
		        System.out.println(mp1.isEmpty()); */
				
				//LinkedHashMap maintains inserting order
				Map<String,String> mp2 = new LinkedHashMap<String,String>();
				
				mp2.put("New York","NYC");
		        mp2.put("California","Los Angeles");
		        mp2.put("Nevada","Las Vegas");
		        mp2.put("Texas","Austin");
		        mp2.put("Florida","Orlando" );
		        mp2.put("Illinois", "Chicago");
		        mp2.put("New Jersey","Trenton");
		        mp2.put("Arizona","Tucson");
		        mp2.put("Maine","Portland");
		        mp2.put("New York","Buffalo");
		       
				
				for(Entry<String,String> eachMp2 : mp2.entrySet()) 
				{
					System.out.println(eachMp2.getKey()+"     "+eachMp2.getValue());
				}
		        
				System.out.println("----------------------------------------------");
				
				System.out.println(mp2.get("California"));
				
				System.out.println("----------------------------------------------");
				
				mp2.remove("Maine");
				
				System.out.println(mp2.entrySet());
				
				System.out.println("----------------------------------------------");
				
				System.out.println(mp2.containsKey("Nevada"));
				System.out.println(mp2.containsValue("Portland")); 
				
				System.out.println("----------------------------------------------");
				
				mp2.clear();
				
				System.out.println(mp2.isEmpty()); 
	}
}
