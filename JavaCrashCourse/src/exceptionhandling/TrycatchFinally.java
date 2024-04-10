package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrycatchFinally {
	
	static String FileName = "ReadMe.txt";
	
	static BufferedReader br = null;
	
	static FileReader fr = null;

	public static void main(String[] args) {
		
		try {
			fr = new FileReader(FileName);
			br = new BufferedReader(fr);
			
			String ScurrentLine;
			
			while((ScurrentLine = br.readLine())!=null) {
				System.out.println(ScurrentLine);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(br!=null) {
					br.close();
				}
				if(fr!=null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
