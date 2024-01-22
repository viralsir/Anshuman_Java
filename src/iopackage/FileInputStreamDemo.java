package iopackage;

import java.io.*;
class FileInputStreamDemo
{
	public static void main(String args[])throws Exception
	{
		FileInputStream ff = new FileInputStream("First.txt");
		int c;
		while((c=ff.read())!=-1)
		{
			System.out.print((char)c);
		}	
		ff.close();
	}
}