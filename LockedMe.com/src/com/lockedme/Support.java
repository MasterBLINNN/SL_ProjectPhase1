package com.lockedme;

import java.io.IOException;
import java.util.Scanner;

public class Support {

	int number;
	int value;
	int pickValue;
	
	FileHandling fileHand = new FileHandling();
	
	
	public void hello () {
		System.out.println("###");
		System.out.println("Welcome in the application -> LockedMe.com; Developer = Lukasz Blicharz");
		System.out.println("###");
		System.out.println("Please pick number from 1 to 2: ");
		System.out.println("###");
		System.out.println("1 to return the current file names in ascending order");
		System.out.println("###");
		System.out.println("2 if you want to add a file to existing directory");
		System.out.println("2 if you want Delete a specified file from the existing directory list");
		System.out.println("2 if you Search a user specified file from the main directory");
		System.out.println("###");
		
	}

	public String scannerImplString(String name) {
		
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("Name: " + name);
		

		return name;
	}
	
	public int scannerImplInteger(int number) {
		
		Scanner scanner = new Scanner(System.in);

		do {
		    while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number. Pick number 1 to continue or any other to close application");
		        scanner.next(); 
		    }
		    number = scanner.nextInt();
		} while (number < 1);
			
		return number;
	}
	
	
	
	
	
	public boolean oneMoreLoop() {
		System.out.println("###");
		System.out.println("Do you want to run program again? If yes type 1 if no type any other value and program will be closed. ");
		pickValue = scannerImplInteger(number);
		if (pickValue == 1) {
			System.out.println("Your pick: " + pickValue);
			return true;
		}
		else 
			System.out.println("Other value selected application is closing. ");
			return false;
	}
	
	
	
	
	public void decision() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int pick;
		
		do {
			System.out.println("Pick number 1 or 2: ");
		    while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number. Pick number 1 or 2");
		        scanner.next(); 
		    }
		    pick = scanner.nextInt();
		} while (pick > 2);
		System.out.println("Your decision: " + pick);
	
	switch (pick) {
	  case 1:
		  System.out.println("1 to return the current file names in ascending order");
		  fileHand.fileCheckOnDirectory();
	    break;
	  case 2:
		  secondDecision();

	    break;
	}
	}
	
	
	public void secondDecision() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int pick;
		String fileName = "";
		
		System.out.println("Select 1 if you want to add a file to existing directory");
		System.out.println("Select 2 if you want Delete a specified file from the existing directory list");
		System.out.println("Select 3 if you Search a user specified file from the main directory");
		
		do {
			System.out.println("Pick number 1 , 2 or 3: ");
		    while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number. Pick number 1 or 2 or 3");
		        scanner.next(); 
		    }
		    pick = scanner.nextInt();
		} while (pick > 3);
		System.out.println("Your decision: " + pick);
	
	switch (pick) {
	  case 1:
		  System.out.println("Type a file name:");
		  
		  try {
			fileHand.createFile(scannerImplString(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    break;
	  case 2:
	    System.out.println("Type a file name that has to be deleted");
	    fileHand.fileCheckOnDirectory();
	    System.out.println("Above list of files available on directory");
	    System.out.println("Type a file name that has to be deleted");
	    fileHand.deleteFile(scannerImplString(fileName));	    
	    
	    break;
	  case 3:
		  System.out.println("Type a file name that you are looking for: ");
		  fileHand.searchFile(scannerImplString(fileName));	     
		    break;
	}
	}
	
	
}
