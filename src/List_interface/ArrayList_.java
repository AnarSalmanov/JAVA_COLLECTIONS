package List_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_ {

	public static void main(String[] args) {
		
		
	/** ----------------- ArrayList -------------------------
	 * Internally uses Array
     * ArrayList class implements to List interface
	 * Maintains the added elements by their insertion order.
     * ArrayList allows null and duplicate values.
	 * Accepts only object type not primitives.
     * Faster than LinkedList and Vector
     * Non-tread safe and synchronized.
	 */

	
	/** ================  CREATION OF ARRAYLIST   =================   */
		
		// 1.Way - Can store only 1 spesified data type
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Anar");
		stringList.add("Samir");
		System.out.println(stringList);

		
		// 2.Way Using List interface - Very common !
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(null);
	    numbers.add(4);
		numbers.add(null);
		System.out.println(numbers);

				
		// 3.Way  Create an ArrayList from another ArrayList
		ArrayList<Double> des = new ArrayList<>();
		des.add(3.5);
		ArrayList <Double> des2 = new ArrayList<>(des); 
		System.out.println(des2);
		
	    // 4.Way --> Create Arraylist Dynamic in one line
		ArrayList<String>citiesList = new ArrayList<>(Arrays.asList(new String [] {"Baku","Sumgait", "Suraxaani"}));
		System.out.println(citiesList);
		
				
		// Converting Array to the List !
		Integer [] digits = {1,4,2,6,3,7};
		List <Integer> digitsList = Arrays.asList(digits);
		System.out.println(digitsList);
		             // or
		List <Integer> digitList2 = Arrays.asList(4,2,8,9,6,15,34);
		System.out.println(digitList2.toString());
	
		
		
		
		// =================== I T E R A T I N G ======================================

		// FOR EACH LOOP
		for (String name : stringList) {
			System.out.print(name + " ");
		}
		System.out.println();

		// FOR LOOP
		for (int i = 0; i < stringList.size(); i++) {
			System.out.print(stringList.get(i) + " ");
		}
		System.out.println();

		
		

		/**                .ADD() 
		 * Adding new item to the ArrayList
		 */

		ArrayList <String >cities = new ArrayList<>();
		cities.add("Balaken");
		cities.add("Sheki");
		cities.add("Shamakhi");
		cities.add("Baku");
	    System.out.println(cities);
		

		/**                 .ADD(INDEX, OBJECT/VALUE) 
		 * Adding new item to the specified index of ArrayList
		 * It will not delete anything, just move others to other position and place this to mentioned index.
		 */
	    cities.add(4, "Monaco");
	    System.out.println(cities);
	    
		
	    
	     /**                 .ADDALL(another list) 
		  * Adding another list into the mentioned ArrayList.
		  */
		  
	    ArrayList<String > newCities = new ArrayList<>();
	    newCities.addAll(cities);
	    newCities.add("Xorasan");
	    System.out.println("New 1" + newCities);
	    

	     /**                 .ADDALL(INDEX, OBJECT/VALUE) 
		  * Adding another list into the mentioned ArrayLisT to the specified index.
		  */
		  
	    ArrayList<String > newCities2 = new ArrayList<>();
	    newCities.addAll(5,cities);
	    System.out.println("New2" +newCities2);
	    
	                         
	    /**                   .ISEMPTY() 
	     * Check whether the list is empty or not, such as String method
	     * Returns :boolean
	     */
	        boolean result = cities.isEmpty();
	        System.out.println(result); //-->false
	    
	    
	    
		/**                   .SIZE() 
		 * Gets the size of(how many element in that) the ArrayList, prototype of .length in array and length() in String.
		 * Returns : int.
		 */
			int lengthh =cities .size();
			System.out.println(lengthh);
			
			
		/**                   .GET() 
		 * Gets the value in spesified index.
		 */
			String name = cities.get(3);
			System.out.println("element in index 3 " + name);
		
			
		/**                 .REMOVE() 
		 * Removes the value by specified index and also directly by object/value
		 * Void method as Array.sort method, does not return the value.
		 */
			cities.remove(2);  //index
			cities.remove("Monaco"); // by Element(String)
			System.out.println(cities);
		             
			              //Removing Integer from list, not arraylist
			ArrayList <Integer> number = new ArrayList<>(Arrays.asList(new Integer []{3,6,4,8,5}));
			number.remove(new Integer (6));
			System.out.println(number );
			
			
		
			
		/**               .REMOVEALL(list1)
		 * It will check the list1, if those elements exist in current list2, 
		 * then it will remove those elements from list2
		 */
			newCities.removeAll(cities);
			System.out.println("New cities removeall " + newCities);
			
			
			
			 
	    /**                 .CONTAINS() 
	     * Checks whether list contains char/char sequence/String/int in given List
	     * Returns :boolean
	     */
			boolean result1 = cities.contains("Baku");
			System.out.println(result1); //true
			
			
			
		
		/**                  .INDEXOF() 
		 * Finds index of mentioned object
		 * Returns : int
		 */
			int index = cities.indexOf("Baku");
			System.out.println("Baku index is " + index);
			
			//find the index of the value and replace the value with 15
			List <Integer> number2 = Arrays.asList(new Integer [] {3,6,4,8,5});
             int indexOf5 = number2.indexOf(5);			
			 number2.set(indexOf5, 15);
			 System.out.println(number2);
			
			
			
			
			
		/**                 .SET (INDEX, Object/VALUE)
		 * 	It will replace the existing value with new one in mentioned index, only index,like Replace in String 
		 * works by index.
		 *  Void method like Arrays.sort method.
		 */
			cities.set(2, "Torino");
			System.out.println(cities);
			
			//Double the value of index  2
			number.set(2, number.get(2)*2);
			System.out.println(number); //4 -> 8
			
			
			
			
			
			/**                .CLEAR() 
			 * Will remove all elements from List.
			 */
			number.clear();
			System.out.println(number);
			
		
		
		
		
		
		
		
		
		
		
		
}

}