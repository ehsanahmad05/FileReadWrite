package com.FileReadWrite;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReadWrite {
public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Welocme To Read/Write Files");
		System.out.println("");
		System.out.println("Enter the File Path :");

		String path=sc.next();
		System.out.println("Your Path is :"+path);
		File f = new File(path);
		
		if (f.exists()) 
		{  
			System.out.println("The name of the file is: " + f.getName()); 
			System.out.println("");
			
			FileWriter fw = new FileWriter(f);
			System.out.println("Write some Data, To Add into a File :");
            String data=sc.next();
            data+=sc.nextLine();
			fw.write(data);
			fw.close();
			System.out.println("Data Added Successfully");
			System.out.println("Do you want to read data from the file :\n1)Yes 2)No");
			int option=sc.nextInt();
                 if(option==1) 
                 {
                	 System.out.println("*******************************************");
							Scanner reader = new Scanner(f);
							while(reader.hasNextLine()) 
							{
								System.out.println(reader.nextLine());
							}
							reader.close();
				}
		         else 
					{
					System.out.println("Thank You");
					}}
		else {  
			System.out.println("The file does not exist.");  
		} 
		sc.close();
  }
}