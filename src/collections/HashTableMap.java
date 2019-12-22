package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(200,"A");
		ht.put(201,"B");
		ht.put(201,"AC");
		ht.put(202,"AD");
		//ht.put(204,null);//NullPointer exception as Null value not supported
		//ht.put(null,"null");//NullPointer exception as Null index not supported

		System.out.println("HAsh table size :"+ht.size());

		for(Map.Entry<Integer, String> m : ht.entrySet()) {
			System.out.println("Hash Table Index : "+m.getKey()+" has value : "+m.getValue());
		}
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(200,"A");
		hm.put(201,"B");
		hm.put(201,"AC");
		hm.put(202,"AD");
		hm.put(null,"ABH");
		hm.put(204,null);
		System.out.println("HAsh map size :"+hm.size());
		for(Map.Entry<Integer, String> m : ht.entrySet()) {
			System.out.println("Hash Map Index : "+m.getKey()+" has value : "+m.getValue());
		}
	}

}
