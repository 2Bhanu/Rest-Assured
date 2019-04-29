package gradleExp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ApiCallsWithJavanet {

	public static void main(String[] args) throws UnknownHostException, IOException {
		URL u = new URL("http://localhost:3000/posts");
		HttpURLConnection hpCon = (HttpURLConnection) u.openConnection();
		
		hpCon.setRequestMethod("GET");
		//hpCon.setRequestProperty("Content-Type", "application/json");
		hpCon.disconnect();
		hpCon.setDoOutput(true);
		
		OutputStream op = hpCon.getOutputStream();
		OutputStreamWriter opr = new OutputStreamWriter(op);
		opr.write("title=book");
		opr.close();
		//while(in.read()!=-1)
		//System.out.print(hpCon.getHeaderFields() + " " + hpCon.getResponseMessage());
		InputStream in = hpCon.getInputStream();
		
		Scanner scan = new Scanner(hpCon.getInputStream());
		String entireResponse = new String();
		while (scan.hasNext())
		entireResponse += scan.nextLine();
		System.out.println(entireResponse);
		
		
	}	

}
