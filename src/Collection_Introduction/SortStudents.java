package Collection_Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudents  {
	
	public static void main(String[] args) {
		Student st1 = new Student(100, "Anar");
		Student st2 = new Student(25, "Samir");
		Student st3 = new Student(50, "Xezer");

		 // List of class objects.
		List<Student> stList = new ArrayList<>();
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
        Collections.sort(stList);
		System.out.println(stList.toString());
	//To sort list list of custom objects we cannot use Collections.sort(list) , we have to 
		//1.implement to Comparable Interface
       //2. override compareTo() method
		
		
		
		
		
		
}
}