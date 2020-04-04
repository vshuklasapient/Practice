package generics;

import java.util.HashMap;
import java.util.Map;

public class hashmap  {
	static HashMap<String,Integer> map = null;
	static class map <T,K>{
	HashMap<T,K> mp = new HashMap<T,K>();
		public HashMap<T, K> insertData(T t,K k) {
			mp.put(t, k);
			return mp;
		}
		
		public void printData(HashMap<T,K> mp) {
			for(Map.Entry<T, K> m : mp.entrySet()) {
				System.out.println("Value for Key:"+m.getKey()+"="+m.getValue());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map<String, Integer> pClass = new hashmap.map<String,Integer>();
		
		map = pClass.insertData("test1",1);
		map = pClass.insertData("test2",2);
		pClass.printData(map);
	}

}
