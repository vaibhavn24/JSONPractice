import org.json.simple.JSONObject;

public class JSONEncode {
	
	
	
	public JSONObject setJsonObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Vaibhav");
		jsonObject.put("salary", new Integer(12000));
		jsonObject.put("age", new Integer(27));
		
		return jsonObject;
	}
	
	
	public void getJsonObject(JSONObject jsonObject) {
		String name = (String)jsonObject.get("name");
		Integer sal = (Integer)jsonObject.get("salary");
		Integer age = (Integer)jsonObject.get("age");
		
		System.out.println("output= "+name+" "+age+" "+sal);
		
	}
	
	public static void main(String[] args) {
		JSONEncode encode = new JSONEncode();
	encode.getJsonObject(encode.setJsonObject());	

	}

}
