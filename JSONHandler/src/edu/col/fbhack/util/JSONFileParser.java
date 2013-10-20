package edu.col.fbhack.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class JSONFileParser {

	static final String jsonProfFile = "C:/Users/Abhinav/workspace/test/res/test_prof.json";
	static final String jsonReviewFile = "C:/Users/Abhinav/workspace/test/res/test_reviews.json";
	
	public static void main(String args [])
	{
		List<String> jsonStringList = getJsonString(jsonReviewFile);
		for(String json : jsonStringList)
		{
			System.out.println(json +"===========");
		}
	}
	
	public static List<String> getJsonString(String file)
	{
		Reader r =null;
		List<String> jsonList = new ArrayList<String>();
		try {
			r = new BufferedReader(new InputStreamReader(new FileInputStream(file), "US-ASCII"));
			String jsonLine = "";
			int intch;
			intch = r.read();
			char ch = (char) intch;
			if(ch == '[' || ch == ']')
			{
				//ignore
			}
			while ((intch = r.read()) != -1) {
				ch = (char) intch;
				if(ch == '}')
				{
					jsonLine = jsonLine + ch;
					intch = r.read();
					ch = (char) intch;					
					if(ch == ',')
					{
						jsonList.add(jsonLine);
						jsonLine = "";
					}
				}
				else
					jsonLine = jsonLine + ch;				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(r!=null)
					r.close();
			} catch (IOException e) {
				// ignore
			}
		}

		return jsonList;

	}
	
	/*public List<Message> readJsonStream(InputStream in) throws IOException {
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        List<Message> messages = new ArrayList<Message>();
        reader.beginArray();
        while (reader.hasNext()) {
            Message message = Gson.fromJson(reader, Message.class);
            messages.add(message);
        }
        reader.endArray();
        reader.close();
        return messages;
    }*/
}
