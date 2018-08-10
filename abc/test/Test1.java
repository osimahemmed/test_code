package com.abc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {
		String s;
		//InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*while ((s = br.readLine()) != null) {
			System.out.println(s);
	    }*/
		//br.close();
		System.out.println("Enter your name");  
		String name=br.readLine();  
		String[] a = name.split(" ");
		System.out.println("Welcome "+a); 
		if(br != null)
			br.close();

	}

}
