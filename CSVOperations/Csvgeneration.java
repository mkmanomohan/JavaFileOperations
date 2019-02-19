package com.myfiles;

import java.io.FileWriter;
import java.io.IOException;

public class Csvgeneration {
	
	public static void main(String[] args) {
		
		int start = 1;
//		int end = 2147483640;
		int end = 47483640;
//		int end = 100;
		
		try
		{
			FileWriter writer = new FileWriter("test.csv");

			writer.append("ID");
			writer.append(',');
			writer.append("name");
			writer.append('\n');
			
			for(int i=start; i<=end; i++)
			{
				writer.append(Integer.toString(i));
				writer.append(',');
				writer.append("name" + i);
				writer.append('\n');
				
				System.out.println("Writing .. " + i);
			}

			writer.flush();
			writer.close();
			
			System.out.println("File Generation Completed");
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
