package letsCode1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

	static boolean clientExists = false;
	
	public static void main(String[] args) {
//		doRequest("https://cc.the-morpheus.de/challenges/1/");
		String res = doGETRequest("https://cc.the-morpheus.de/challenges/1/");
		System.out.println(res);
		doPOSTRequest("https://cc.the-morpheus.de/solutions/1/", res);
	}
	
	private static String doGETRequest(String adress) {
		
		clientExists = true;
		HttpClient client = HttpClient.newHttpClient();
	
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create(adress))
				.build();	
		
		HttpResponse<String> httpRes;
		try {
			httpRes = client.send(request, BodyHandlers.ofString());
			return httpRes.body();
		} catch (IOException e) {e.printStackTrace();}
		catch (InterruptedException e) {e.printStackTrace();}
		return null;
	}
	
//	private static String doPOSTRequest(String adress ,String input) {
//		
//		clientExists = true;
//		HttpClient client = HttpClient.newHttpClient();
//
//		
////		HttpRequest request = HttpRequest.newBuilder()
////				.uri(URI.create(adress))
////				.POST(HttpRequest.BodyPublishers.ofString(input))
////				.POST(Ht)
////				.build();	
//		
////		
////		HttpResponse<String> httpRes;
////		try {
////			httpRes = client.send(request, BodyHandlers.ofString());
////			System.out.println(httpRes);
////			return httpRes.body();
////		} catch (IOException e) {e.printStackTrace();}
////		catch (InterruptedException e) {e.printStackTrace();}
////		return null;
//	}
	
	private static String doPOSTRequest2(String adress ,String input) throws IOException {
		URL url = new URL(adress);
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("POST");
		
		con.setRequestProperty("COntent-Type","applycation/json; utf-8");
		
		con.setRequestProperty("Accept", "application/json");

		con.setDoOutput(true);
		
		
		
		
		return input;
		
		
	}
	
}
