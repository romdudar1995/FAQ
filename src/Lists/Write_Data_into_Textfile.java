package Lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_into_Textfile {

	public static void main(String[] args) throws IOException {


		FileWriter fw = new FileWriter("C:\\data\\123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");
		bw.write("Selenium with Java Script");
		
		System.out.println("Finished!");
		
		bw.close();
		

	}

}
