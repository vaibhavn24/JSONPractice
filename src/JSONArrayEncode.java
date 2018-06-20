import org.json.simple.JSONArray;

public class JSONArrayEncode {
public static void main(String[] args) {
	JSONArray array = new JSONArray();
	
	array.add("Amit");
	array.add(27);
	array.add(50450);
	
	System.out.println(array);
}
}
