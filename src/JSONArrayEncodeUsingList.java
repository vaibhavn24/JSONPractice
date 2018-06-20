import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

public class JSONArrayEncodeUsingList {
	public static void main(String[] args) {
	List list = new ArrayList();
	list.add("vaibhav");
	list.add(24);
	list.add(55452);
	
	String arr = JSONValue.toJSONString(list);
	System.out.println(arr);
}
}
