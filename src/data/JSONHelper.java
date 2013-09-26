package data;

import net.minidev.json.*;

public class JSONHelper {
	
	public JSONHelper(){
	}
	
	public JSONArray extractArrayFromString(String result, String key){
		Object obj = JSONValue.parse(result);
		return (JSONArray)(((JSONObject)obj).get(key));
	}
	
	public JSONArray extractArrayFromArray(JSONArray array, String key){
		Object obj = (Object)array.get(0);
		return (JSONArray)(((JSONObject)obj).get(key));
	} 

}
