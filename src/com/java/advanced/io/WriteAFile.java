package com.java.advanced.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB14\\resource\\sample.txt";
		File file = new File(path);// Access Files and Directories(Folders)

		String msg = "Java Shava !!! \n  Its is almost the end of this course";

		if (file.exists()) {
			try (FileOutputStream fos = new FileOutputStream(file);) {
				
				fos.write(msg.getBytes());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
