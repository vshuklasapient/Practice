package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import common.EmployeeClass;

public class SerializationExample{

	/**
	 * 
	 */

	static String filename = "file.ser"; 
	static EmployeeClass empDes ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClass emp = new EmployeeClass();
		emp.setIntEmpID(2);
		emp.setStrName("Ram");
		emp.setStrLocation("Ayodhya");
		System.out.println("Before Serialization value of Id - "+emp.getIntEmpID());
		System.out.println("Before Serialization value of Name - "+emp.getStrName());
		System.out.println("Before Serialization value of Location - "+emp.getStrLocation());
		
		 // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(emp); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        
        // De-Serialization  
        try
        {    
            //Reading from object in a file 
            FileInputStream fileIn = new FileInputStream(filename); 
            ObjectInputStream ois = new ObjectInputStream(fileIn); 
              
            // Method for de-serialization of object 
            try {
				empDes = (EmployeeClass)ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              
            ois.close(); 
            fileIn.close(); 
              
            System.out.println("Object has been de serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        System.out.println("After De-Serialization value of Id - "+empDes.getIntEmpID());
		System.out.println("After De-Serialization value of Name - "+empDes.getStrName());
		System.out.println("After De-Serialization value of Location - "+empDes.getStrLocation());
		

		
	}

}
