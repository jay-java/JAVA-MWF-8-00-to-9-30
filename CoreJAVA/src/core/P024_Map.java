package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P024_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "java"); // entry
		map.put(34, "php");
		map.put("python", 4356.456);
		map.put(false, 'f');
		map.put("hello", 3245);
		map.put(12, "dart");
		map.put(1, "kotlin");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
//			Map.Entry entry = (Entry) itr.next();
//			System.out.println("key : "+entry.getKey());
//			System.out.println("value : "+entry.getValue());
			System.out.println(itr.next());
		}
	}
}
