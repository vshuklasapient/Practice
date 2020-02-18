package collections;

import java.util.ArrayList; 
import java.util.LinkedList; 

/*
 Insertions are easy and fast in LinkedList as compared to ArrayList because there is no
risk of resizing array and copying content to new array if array gets full which makes
adding into ArrayList of O(n) in worst case, while adding is O(1) operation in LinkedList
in Java. ArrayList also needs to be update its index if you insert something anywhere except
at the end of array.
Removal also better in LinkedList than ArrayList due to same reasons as insertion.
LinkedList has more memory overhead than ArrayList because in ArrayList each index only
holds actual object (data) but in case of LinkedList each node holds both data and address
of next and previous node.
Both LinkedList and ArrayList require O(n) time to find if an element is present or not.
However we can do Binary Search on ArrayList if it is sorted and therefore can search in O(Log n) time.
filter_none
 */
  
public class ArrayListLinkedListExample 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<String> arrlistobj = new ArrayList<String>(); 
        arrlistobj.add("0. Practice.GeeksforGeeks.org"); 
        arrlistobj.add("1. Quiz.GeeksforGeeks.org"); 
        arrlistobj.add("2. Code.GeeksforGeeks.org"); 
        arrlistobj.remove(1);  // Remove value at index 2 
        System.out.println("ArrayList object output :" +  arrlistobj); 
  
        // Checking if an element is present. 
        if (arrlistobj.contains("2. Code.GeeksforGeeks.org")) 
            System.out.println("Found"); 
        else
            System.out.println("Not found"); 
  
  
        LinkedList<String> llobj = new LinkedList<String>(); 
        llobj.add("0. Practice.GeeksforGeeks.org"); 
        llobj.add("1. Quiz.GeeksforGeeks.org"); 
        llobj.add("2. Code.GeeksforGeeks.org"); 
        llobj.remove("1. Quiz.GeeksforGeeks.org"); 
        System.out.println("LinkedList object output :" + llobj); 
  
        // Checking if an element is present. 
        if (llobj.contains("2. Code.GeeksforGeeks.org")) 
            System.out.println("Found"); 
        else
            System.out.println("Not found"); 
    } 
} 