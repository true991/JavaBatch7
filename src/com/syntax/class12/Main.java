package com.syntax.class12;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



//Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
//Step 2: Create appleMap<String, Object> and add below pairs into it. 
//	"Items", "Apple"
//	"Price", 20.00
//	"Quantity", 10
//Step 3: Add appleMap to dataList. 
//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
//	"Items", "Orange" 
//	"Price", 21.99
//	"Quantity", 10
//Step 5: Add orangeMap to dataList. 
//Step 6: Create a loop from dataList. 
//Step 7: Retrieve each Key and store is in a variable. 
//Step 8: calculate the subtotal of each object. 
//Step 9: Print the values of each Iteration same as shown below in Output example. 
//Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase. 
//
//Step 11: After Loop Print the value of Total Purchase. 

class Main {

	public static void main(String[] args) {
		
		List <Map<String,Object>> dataList = new LinkedList<>();
				
		Map <String, Object> appleMap = new HashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
		
		dataList.add(appleMap);
		
		Map <String, Object> orangeMap = new HashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		
		dataList.add(orangeMap);
		
//		Set <String> keys = new LinkedHashSet<>();
		
		
//		for (Map<String, Object> map : dataList) {
//			keys.add(map.get(map));	
//		}
//		
//		
		


		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
	}

}
