package com.tut.json;

import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONObject;

public class JsonUtil {
	public static String getJsonStringFromFile(String path) {
		Scanner scanner;
		InputStream in = FileHandle.inputstreamFromFile(path);
		scanner = new Scanner(in);
		String json = scanner.useDelimiter("//Z").next();
		scanner.close();
		return json;
	}
	public static JSONObject getJsonObjectFromFile(String path) {
		
		
		
		return new JSONObject(getJsonStringFromFile(path));
	}
	
	public static boolean objectExists(JSONObject jsonObject,String key) {
		Object o;
		
		try {
			o = jsonObject.get(key);
		} catch (Exception e) {
			return false;
		}
		
		return o != null;
		
	}
}
