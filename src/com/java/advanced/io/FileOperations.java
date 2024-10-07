package com.java.advanced.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperations {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB14\\resource\\sample.txt";

		File file = new File(path);// Access Files and Directories(Folders)

		if (file.exists()) {
			
			
			
			System.out.println("Folder ? "+file.isDirectory());
			System.out.println("File ? "+file.isFile());
			
			System.out.println(new Date(file.lastModified()));
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			
			file.delete();



		} else {
			System.out.println("Invalid Path");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
