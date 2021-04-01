package com.lockedme;

import java.io.IOException;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) throws IOException {

		Support execution = new Support();
		
		do {
			execution.hello();			
		
			execution.decision();
		}
			while (execution.oneMoreLoop());
		
	}

}
