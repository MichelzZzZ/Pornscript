/*
 * 
 * Pornscript
 * 
 * -----------------------------------------------------------------------------------------
 * 
 * an esoteric programming language that is designed to make programming dirty.
 * Pornscript is in it's early stage and needs a lot to work on. The language is written in 
 * Java means you can run it on most operating systems.
 * 
 * -----------------------------------------------------------------------------------------
 * 
*/
package com.pornscript.process;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.pornscript.exceptions.IllegalSyntaxException;
import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAddressException;

/**
 * 
 * This is the EntryPoint class where the pornscript program starts
 * executing.
 *
 */

public class EntryPoint 
{
	
	/**
	 * 
	 * The main method does some quick tests before running the 
	 * pornscript program
	 * 
	 * @param args
	 * @throws IOException
	 * @throws IllegalSyntaxException
	 * @throws UnavailableAddressException
	 * @throws TooManyArgumentsException
	 * @throws TooFewArgumentsException
	 * 
	 */
	
	public static void main(String[] args) throws IOException, IllegalSyntaxException, UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException
	{
		
		/**
		 * 
		 * <h2> Test case 1: </h2>
		 * 
		 * First check if there's a file called "script.ps" in the current
		 * directory. It will usually check in system files because pornscript
		 * will be running in command prompt.<br>
		 * 
		 * If the file doesn't exist, create it and exit the program <br>
		 * 
		 * If the file exists go to the next test case
		 *
		 */
		
		File f = new File("script.ps");
		
		if(!f.exists())
		{
			
			FileWriter w = new FileWriter(f);
			w.write("");
			w.close();
			
			System.exit(0);
			
		}
		
		/**
 		 *
	 	 * <h2> Test case 2: </h2>
	 	 * 
		 * check if it contains the classic opening
		 * "WHAT ARE YOU DOING STEP BRO!!".<br>
		 * 
		 * If it doesn't contain the classic opening, throw an exception<br>
		 * 
		 * If it does contains the opening succesfully send the code to the validator<br>
		 * 
		 */
		 
		Scanner sc = new Scanner(f);
		
		if(!sc.nextLine().startsWith("WHAT ARE YOU DOING STEPBRO!!"))
			throw new IllegalSyntaxException("Every pornscript folder should start with the classic opening: \n WHAT ARE YOU DOING STEPBRO!!");
		
		new Validator().iterateThroughScanner(sc);
		
	}

}
