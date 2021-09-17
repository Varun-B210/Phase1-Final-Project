package com;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.addfile.addFile;



public class LockedMe {
	
public static void addfile() throws IOException{ 
	System.out.println("Enter the file name to be added");
	try {
		Scanner s=new Scanner(System.in);
		String x=s.next();
		File file=new File("C:\\Users\\Varun Acharya\\Desktop\\LockedMe", x);
		if(file.createNewFile()) {
			
			System.out.println("File created successfully");
			
		}
		else
		{
			System.out.println("File already exists");
		}
		}
	
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
}


public static void intro() {
	System.out.print("\t");
	for(int i=0;i<49;i++) {
		System.out.print("~");
	}
	System.out.println("\n\t|\tHELLO!! WELCOME TO  LockedMe.com\t|");
	System.out.println("\t|   This application was developed by Varun B   |");
	System.out.print("\t");
	for(int i=0;i<49;i++) {
		System.out.print("~");
	}
	System.out.println("\n");
	for(int i=0;i<85;i++) {
		System.out.print("-");
	}
	System.out.println("\nThe features of this application are : "
			+ "\n a) To get the list of all the files "
			+ "present in the main directory \n b) To perform functions like "
			+ "create,delete & search for a file in the "
			+ "main directory");
	for(int i=0;i<85;i++) {
		System.out.print("-");
	}
}
public static void mainmenu() throws IOException{
	System.out.println("\n--Enter M to go back to main menu--");
	Scanner sc=new Scanner(System.in);
	String mm=sc.next();
	if(mm.equals("M")) {
			 menu();
	}
	else
	{System.out.println("**Enter a valid command**");
	mainmenu();
}
}


public static void mainfomenu() throws IOException
{
	System.out.println("\n--Enter M to go back to main menu--\n\t\tOR");
	System.out.println("--Enter F to go back to filehandling menu--");
	Scanner sc=new Scanner(System.in);
	String mm=sc.next();
	if(mm.equals("M")) {
			 menu();
	}
	else if(mm.equals("F"));{	
		foMenu();
	}
	
		{
	System.out.println("**Enter a valid command**");
	mainfomenu();
		}
}



public static void foMenu() throws IOException{
	System.out.println("\n\t----------<  FILE HANDLING MENU  >----------");
	System.out.println("What would you like to do?"
	+ "\n add - Add a new file to <LockedMe> folder"
	+ "\n sea - To search for a file from <LockedMe> folder"
	+ "\n del - To delete a file from <LockedMe> folder"
	+ "\n M - To go back to the Main Menu");	
	
Scanner s=new Scanner(System.in);
String l=s.next();
switch(l) {

case "add":
	  	addfile();
	  	mainfomenu();
	  		
	break;

case"sea": 
		System.out.println("Enter the file name to be searched");

Scanner scan=new Scanner(System.in);
String q=scan.next();
String path="C:\\Users\\Varun Acharya\\Desktop\\LockedMe";
File f=new File(path);
for(File abc:f.listFiles()) {
	
			if(abc.getName().contentEquals(q)) 
			{
				System.out.println("\nFile found at --> "+ abc.getAbsolutePath());
		
			
				}		
}	
				mainfomenu();
				break;
case"del": 
			
			System.out.println("Enter the file name to be deleted");
			
			Scanner scn=new Scanner(System.in);
			String r=scn.next();
			File j=new File("C:\\Users\\Varun Acharya\\Desktop\\LockedMe", r);
			
			if(j.delete()) {
			
			System.out.println(r +" successfully deleted");
			}
			else
			{
			System.out.println("File not found");
			}
			mainfomenu();
			break;
case "M": menu();

}
}


public static void menu() throws IOException{
	System.out.println("\n\n\t----------<  MAIN MENU  >----------");
	System.out.println("Enter the following commands to perform operation:");
	System.out.println("fl -- To list all the files in the"+ " <LockedMe> "+ "folder");
	System.out.println("fo -- To open file handling menu");
	System.out.println("x -- To exit the application");
	
	Scanner sc=new Scanner(System.in);
	String path="C:\\Users\\Varun Acharya\\Desktop\\LockedMe";
	File f=new File(path);
	while(true){
		String a=sc.next();
		switch(a) {
		case "fl":System.out.println("\nThe list of files present are :");
				 File[] files=f.listFiles();	
				 for(File file:files) {
					 if(file.isFile()) {	 
					 System.out.println(file.getName());			 			 
					 }
		}
		mainmenu();
					break;
		case "fo":				
					foMenu();
					break;
			
			
		case "x":System.out.println("\n\t** Thank you for using LockedMe.com **");
					System.exit(0);
						break;
		default:System.out.println("**Command not found.\nPlease enter a valid command**");
		break;
		
		}
	}
	}
	


	

	 
	



	
	public static void main(String[] args) throws IOException {
		intro();
		
		menu();
	}
		
	
}