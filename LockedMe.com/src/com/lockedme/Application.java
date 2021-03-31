package com.lockedme;

import java.io.IOException;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) throws IOException {

		Support text = new Support();
		
		do {
			text.hello();			
		
			text.decision();
		}
			while (text.oneMoreLoop());
		
	
		
		
	
		
		//fileHand.createFile(input);
		
		
		//fileHand.fileCheckOnDirectory();
		
		
		
	}

}
