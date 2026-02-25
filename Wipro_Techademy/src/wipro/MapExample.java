package wipro;

import java.util.*;
import java.util.Map;
 
public class MapExample {
public static void main(String[] args)
{
Map<Integer, String>Employee = new HashMap<>();
//HashMap<Integer, String>Employee1= new HashMap<>();
 
		Employee.put(101, " Vinay ");
		Employee.put(102, " Sonali ");
		Employee.put(103, " Renu ");
		System.out.println(Employee);
		
		
		System.out.println("Initial Map: " + Employee);
		
		//get()
		String name = Employee.get(101);
		System.out.println("Value for key 101: " + name);
		
		// containsValue()
        boolean hasValue = Employee.containsValue(" Vinay ");
        System.out.println("Contains value 'Vinay': " + hasValue);
        
        //  remove()
        Employee.remove(102);
        System.out.println("After removing key 102: " + Employee);
		
        // replace()
        Employee.replace(103, "Reena");
        System.out.println("After replace: " + Employee);
 
	}
 
}
 