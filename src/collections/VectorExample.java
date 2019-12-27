package collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//is same as Array List.Vector methods are synchronized.Thread safety.
			Vector <String> names = new Vector <String> ( );
			 names.add ("cherry");
			names.add ("apple");
			names.add ("banana");
			names.add ("kiwi");
			names.add ("apple");
			System.out.println (names);
			}
	}

