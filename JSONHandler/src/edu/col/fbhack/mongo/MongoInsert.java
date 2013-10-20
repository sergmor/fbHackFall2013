package edu.col.fbhack.mongo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

import edu.col.fbhack.util.JSONFileParser;

public class MongoInsert {

	static final String jsonProfFile = "C:/Users/Abhinav/workspace/test/res/professors.json";
	static final String jsonReviewFile = "C:/Users/Abhinav/workspace/test/res/reviews.json";
	
	static String dbName = "db"; static String serverIp = "54.204.6.142";//"ec2-23-20-234-152.compute-1.amazonaws.com"; 
	static int serverPort = 27017; 
	static String profCollName = "profData"; static String reviewCollName = "reviewData";

	public static void main(String[] args) {
		try {

			List<String> proflist = JSONFileParser.getJsonString(jsonProfFile);
			List<String> reviewList = JSONFileParser.getJsonString(jsonReviewFile);

			//put(profCollName, proflist);
			//put(reviewCollName, reviewList);
			//List<String> profDblist = read(profCollName);
			List<String> reviewDblist = read(reviewCollName);
			//cleanUp(reviewCollName);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}

	}

	public static void put(String collName, List<String> list) throws UnknownHostException
	{
		Mongo mongo = new Mongo(serverIp, serverPort);
		DB db = mongo.getDB(dbName);
		DBCollection collection = db.getCollection(collName);
		for(String s : list)
		{
			try{
			DBObject dbObject = (DBObject) JSON.parse(s);
			
			collection.insert(dbObject);
			}
			catch(Exception e)
			{
				System.out.println("Fault - ignore");
			}
		}
	}

	public static List<String> read(String collName) throws UnknownHostException
	{
		List<String> list = null;
		Mongo mongo = new Mongo(serverIp, serverPort);
		DB db = mongo.getDB(dbName);
		DBCollection collection = db.getCollection(collName);
		list = new ArrayList<String>();
		DBCursor cursorDoc = collection.find();
		while (cursorDoc.hasNext()) {
			String str = cursorDoc.next().toString();
			list.add(str);
			System.out.println(str);
		}
		return list;
	}
	
	public static void cleanUp(String collName ) throws UnknownHostException
	{
		Mongo mongo = new Mongo(serverIp, serverPort);
		DB db = mongo.getDB(dbName);
		DBCollection collection = db.getCollection(collName);
		collection.drop();
	}

}
