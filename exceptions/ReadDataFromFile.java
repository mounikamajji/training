package com.cg.corejava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("vivek.txt");
			int ch;
			while((ch = fis.read()) !=-1){
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
