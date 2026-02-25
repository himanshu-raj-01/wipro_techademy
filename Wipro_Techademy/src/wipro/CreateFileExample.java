package wipro;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class CreateFileExample
{
public static void main(String[] args)
{
try {
	File file = new File("Tech.txt");
//	if(file.createNewFile())
//{
//	System.out.println("File created Successfully");
//}
//else
//{
//	System.out.println("File alredy exists");
// 
//}
	
	//write message to file
	FileWriter writer = new FileWriter(file);
//	writer.write("Welcome to File Handling Example");
//	writer.close();
	
	 writer.write("\nThis line is appended to the file");
     System.out.println("Message Appended");
     writer.close();
	
	//reading the file
	BufferedReader br = new BufferedReader(new FileReader(file));
	
	String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    br.close();
	
	
}
catch(IOException e)
{
	e.printStackTrace();
}
}
 
}
 