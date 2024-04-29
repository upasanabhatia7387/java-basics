package com.demo.Poly;

public class DBLogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBLogic mysql = new MYSQLDB();
		DBLogic mongodb = new MongoDBImp();
		mysql.save();
		mysql.delete();
		mysql.update();
		mysql.find();
		mongodb.delete();
		mongodb.find();
		mongodb.update();
		mongodb.save();
		//mysql.test();

	}

}
