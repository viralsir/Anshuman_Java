package iopackage;/*

	
	FMS : - FILE MANAGMENT SYSTEM 
		
	DBMS 

	JDK 1.3


		STREAM :- DATA -> BYTE 
	
			OUTPUTSTREAM :- TO WRITE / STORE DATA INTO FILE
			INPUTSTREAM :- TO READ FROM FILE 
		
		
		
*/


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class ByteArrayOutputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String temp="this is firstdemo by Anshuman";
		byte b[] = temp.getBytes();
		bout.write(b);
		System.out.println("String is : " + bout.toString());
		
		FileOutputStream fout = new FileOutputStream("first.txt");
		bout.writeTo(fout);
	}
}





