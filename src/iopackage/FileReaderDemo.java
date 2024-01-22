package iopackage;

import java.io.*;
class FileReaderDemo
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr = new FileReader("FileInputStreamDemo.java");
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		while((s=br.readLine())!= null)
		{
			System.out.println(s);
		}	
	}
}