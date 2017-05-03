package com.maliang.test;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class TestMongodb {

	@Test
	public void testMongodb() throws Exception {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient("127.0.0.1", 27017);

		MongoDatabase database = client.getDatabase("maliang");

		System.out.println(database);
		MongoCollection<Document> table = database.getCollection("book");
		System.out.println(table);
		Map<String, Object> map = new HashMap<>();
		map.put("code", "12312312");
		map.put("name", "套作");
		map.put("num", "500");
		Document arg0 = new Document(map);
		table.insertOne(arg0);
	}
	
	
	@Test
	public void testMongodb1() throws Exception {
		MongoClient client = new MongoClient("127.0.0.1", 27017);

		MongoDatabase database = client.getDatabase("maliang");
		MongoCollection<Document> table = database.getCollection("book");
		FindIterable<Document> data = table.find();
		MongoCursor<Document> datas = data.iterator();
		while(datas.hasNext()){
			Document doc = datas.next();
			System.out.println(doc.get("code")+"+"+doc.get("num")+"+"+doc.get("name"));
			System.out.println();
		}
	}
	
	@Test
	public void testMongodb2() throws Exception {
		MongoClient client = new MongoClient("127.0.0.1", 27017);

		MongoDatabase database = client.getDatabase("maliang");
		MongoCollection<Document> table = database.getCollection("book");
			table.updateOne(Filters.eq("num",20), new Document("$set",new Document("num",100)));
			System.out.println("update sucess");
			 FindIterable<Document> datas = table.find();
			MongoCursor<Document> data = datas.iterator();
			while(data.hasNext()){
				Document doc = data.next();
				System.out.println(doc.get("code")+"+"+doc.get("num")+"+"+doc.get("name"));
				System.out.println();
			}
	}
	
	@Test
	public void testMongodb3() throws Exception {
		MongoClient client = new MongoClient("127.0.0.1", 27017);

		MongoDatabase database = client.getDatabase("maliang");
		MongoCollection<Document> table = database.getCollection("book");
			System.out.println("update sucess");
			 FindIterable<Document> datas = table.find(Filters.eq("num",100));
			MongoCursor<Document> data = datas.iterator();
			while(data.hasNext()){
				Document doc = data.next();
				System.out.println(doc.get("code")+"+"+doc.get("num")+"+"+doc.get("name"));
				System.out.println();
			}
	}
	
	@Test
	public void testMongodb4() throws Exception {
		MongoClient client = new MongoClient("127.0.0.1", 27017);

		MongoDatabase database = client.getDatabase("maliang");
		MongoCollection<Document> table = database.getCollection("book");
		table.deleteOne(Filters.eq("num",20));
			 FindIterable<Document> datas = table.find();
			MongoCursor<Document> data = datas.iterator();
			while(data.hasNext()){
				Document doc = data.next();
				System.out.println(doc.get("code")+"+"+doc.get("num")+"+"+doc.get("name"));
				System.out.println();
			}
	}
}
