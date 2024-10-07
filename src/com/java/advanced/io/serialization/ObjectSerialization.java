package com.java.advanced.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {

	public static void main(String[] args) {
		Student st1 = new Student("Suman", 10);
		System.out.println(st1);

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB14\\resource\\sample.txt";
		File file = new File(path);

		try (FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			oos.writeObject(st1);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
