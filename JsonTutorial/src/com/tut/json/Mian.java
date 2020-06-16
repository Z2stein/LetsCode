package com.tut.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class Mian {
	public static void main(String[] args) {
		JSONObject obj = JsonUtil.getJsonObjectFromFile("/obj.json");
		
		System.out.println(obj+"\n");
		
		String[] names = JSONObject.getNames(obj);
		for (String string : names){
			System.out.println(string + ": "+obj.get(string));
		}
		
		System.out.println("\n");
		
		JSONArray jsonArray = obj.getJSONArray("Array");
		for( int i =0; i<jsonArray.length();i++){
			System.out.println(jsonArray.get(i));
		}
	}
}