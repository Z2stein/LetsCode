package com.tut.json;

import java.io.InputStream;

public class FileHandle {
	public static InputStream inputstreamFromFile(String path) {
		// TODO Auto-generated method stub
		try {
			InputStream inputStream = FileHandle.class.getResourceAsStream(path);
			return inputStream;
		} catch (Exception e) {
		
		}
		return null;
	}
}
