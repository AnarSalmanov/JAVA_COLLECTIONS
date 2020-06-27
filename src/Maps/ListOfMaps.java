package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {

		Map<String, Object> map1 = new HashMap<>();
		map1.put("firstName", "Anar");
		map1.put("lastname", "Salmanov");
		map1.put("gender", "male");
		System.out.println(map1);

		Map<String, Object> map2 = new HashMap<>();
		map2.put("firstName", "Nazakat");
		map2.put("lastname", "Salmanova");
		map2.put("gender", "female");
		System.out.println(map2);

		Map<String, Object> map3 = new HashMap<>();
		map3.put("firstName", "Anara");
		map3.put("lastname", "Salmanli");
		map3.put("gender", "female");
		System.out.println(map3);

		List<Map<String, Object>> listOfMaps = new ArrayList<>();
		listOfMaps.add(map1);
		listOfMaps.add(map2);
		listOfMaps.add(map3);

		
		for (int i = 0; i < listOfMaps.size(); i++) {
			System.out.println(i + " " + listOfMaps.get(i).get("firstName"));

		}
		   // or
		for(Map<String,Object> mapname : listOfMaps) {
			System.out.println(mapname.get("lastname"));
			
		}

	}

}
