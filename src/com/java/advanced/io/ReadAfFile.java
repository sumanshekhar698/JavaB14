package com.java.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAfFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB14\\resource\\sample.txt";

		File file = new File(path);// Access Files and Directories(Folders)

		if(file.exists()) {
			try(FileInputStream fis = new FileInputStream(file);) {
				

				int ch;

				while ((ch = fis.read()) != -1) {
					System.out.print((char)ch);

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
