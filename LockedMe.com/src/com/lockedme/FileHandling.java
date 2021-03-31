package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FileHandling {


	
	public void fileCheckOnDirectory()
    {

        File folder = new File("Files");
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            Arrays.sort(fileList);

            System.out.println("\nDirectory: " + folder.getAbsolutePath());
            
            System.out.println("\nTotal number of items present in the directory: " + fileList.length);


            // Sort files by name
            Arrays.sort(fileList, new Comparator<Object>()
            {
                @Override
                public int compare(Object f1, Object f2) {
                    return ((File) f1).getName().compareTo(((File) f2).getName());
                }
            });

            //Prints the files in file name ascending order
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

        }
        }
	
	public void createFile(String name) throws IOException {
		
		File file = new File("Files\\"+name);
		if (file.createNewFile()) {
		System.out.println("File is created.");	
		} else { System.out.println("File already exists.");

		}
		}
		
	
	public void deleteFile(String name) {
		
	    	 File file = new File("Files\\"+name);
	    
	    	 if (file.delete()) { 
			      System.out.println("Deleted the file: " + file.getName());
			    } else {
			      System.out.println("Failed to delete the file. File doesn't not exist");
			    } 
	    	 
	     }
		
	
	}
	
	
