import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		// Adding elements to map
		map.put(1, "vijay");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map
		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value
			// separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		// Iterate over all keys.

		for (Integer key : map.keySet()) {

			System.out.println(key + " - " + map.get(key));

			System.out.println();
		}
		// Clear all values.
		map.clear();
		// Equals to zero.
		System.out.println("After clear operation, size: " + map.size());

	}
}
