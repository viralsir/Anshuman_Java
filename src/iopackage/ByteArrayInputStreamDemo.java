package iopackage;

/*
	   io

	    Stream :-
	                  OutputStream : to write data into file
	                  InputStream : to read data from file

	                 data -- Byte -- File


 */

import java.io.*;
class ByteArrayInputStreamDemo
{
	public static void main(String args[])
	{
		String temp="this is test";
		byte b[] = temp.getBytes();
		int c;

		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		while((c=bin.read())!= -1)
		{
			System.out.print((char)c);		
		}
		bin.reset();
		System.out.println();
		while((c=bin.read())!= -1)
		{
			System.out.print(Character.toUpperCase((char)c));
		}	
	}
}