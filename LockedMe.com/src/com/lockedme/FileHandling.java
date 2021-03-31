package com.lockedme;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.Comparator;

public class FileHandling {

	private static final String path = "Files\\";
	
	
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
		
		File file = new File(path(name));
		if (file.createNewFile()) {
		System.out.println("File is created.");	
		} else { System.out.println("File already exists.");

		}
		}
		
	
	public void deleteFile(String name) throws IOException {
		
	    	 File file = new File(path(name));
	    	    	 
	    if(fileExistsCaseSensitive(path(name))) {
	  
	    	file.delete();
	    	System.out.println("Deleted the file: " + file.getName());
			    } 
	    	else {
			System.out.println("Failed to delete the file. File doesn't not exist");
			    }   
	    	 
	     }
	

	
	public void searchFile(String name) {    
			
			
				
	    	 File file = new File(path(name));
	    
	    	 if(fileExistsCaseSensitive(path(name)))  { 
			      System.out.println("File : " + file.getName()  + " exist in the directory");
			    } else {
			      System.out.println("File does not exist.");
			    } 
	    	 
	     }

	
	public static boolean fileExistsCaseSensitive(String path) {
	    try {
	        File file = new File(path);
	        return file.exists() && file.getCanonicalFile().getName().equals(file.getName());
	    } catch (IOException e) {
	        return false;
	    }
	}
	

	public static String getPath() {
		return path;
	}
	
	public static String path(String name) {
		String path = getPath()+name;
		
		return path;
	}
	
	
        }
		
	
	
	
	
