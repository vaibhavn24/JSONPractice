import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JSONEncodeUsingMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("name", "VAibhav NArkhede");
		map.put("age", 27);
		map.put("salary", 60000);
		
		String jsonText = JSONValue.toJSONString(map);
		
		System.out.println(jsonText);
	}
}
