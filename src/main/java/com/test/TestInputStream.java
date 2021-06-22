package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TestInputStream {

	public static void main(String[] args) {
		try {
			
//			ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Users/admin/Desktop/revature-java-training/eclipse-workspace/ReviewExercise"));
//			URL url = getClass().getResource("ListStopWords.txt");
//			File file = new File(url.getPath());
//			InputStream input = input.getClass().getResourceAsStream("test.txt");
//			InputStream input = TestInputStream.class.getResourceAsStream("./test.txt");
//			System.out.println(input);
			
			FileInputStream fin = new FileInputStream("/Users/admin/Desktop/revature-java-training/eclipse-workspace/Java-Assignments/PracticeProject2/src/main/webapp/WEB-INF/test.txt");
//			System.out.println(System.getProperty("user.dir"));
			int i = 0;
			while((i=fin.read()) !=-1) {
				System.out.println((char)i);
			}
			fin.close();
		
		}catch(Exception e) {System.out.println(e);}
	}
}

