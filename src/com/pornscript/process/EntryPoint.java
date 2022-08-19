/**
 * 
 * Pornscript is an esoteric programming language that 
 * is designed to sound dirty
 *
 * The current version doesn't provide any UI, and is 
 * accesibale through command prompt
 * 
 * to get started, first make sure you have Java 17 or 
 * newer installed.
 * 
 * Now install "Pornscript.jar" after installing it, copy
 * the directiory of the jar file
 * 
 * Now open command prompt as adminisator, type
 * 
 * 		java -jar <paste directory>
 * 
 * after that type
 * 
 * 		script.ps
 * 
 * it will open a file in notepad. or whatever is your default text
 * editor. now in the file type
 * 
 * 		WHAT ARE YOU DOING STEPBRO!!
 * 		moan:hello world
 * 
 * Save the text file and again in command prompt type
 * 
 * 		java -jar <paste directory>
 * 
 * And the console will print hello world.
 * 
 * this is a very simple hello world program. More about
 * the syntax will be documented in the github page.
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
import com.pornscript.exceptions.UnavailableAdressException;

/**
 * 
 * The pornscript interepter will start working from here <br>
 * The process will go from entry point to validator
 * 
*/

public class EntryPoint 
{
	
	/**
	 * 
	 * First check if there's a file called "script.ps" in the current <br>
	 * directory. It will usually check in system files because pornscript <br>
	 * will be running in command prompt. <br><br>
	 * 
	 * If the file doesn't exist, create it and exit the program <br><br>
	 * 
	 * If the file exists, check if it contains the classic opening <br>
	 * "WHAT ARE YOU DOING STEP BRO!!". <br><br>
	 * 
	 * If it doesn't contain the class opening, throw an exception <br><br>
	 * 
	 * If it does contains the opening send the code to the validator <br><br>
	 * 
	 * @throws IOException 
	 * @throws IllegalSyntaxException 
	 * @throws UnavailableAdressException 
	 * @throws TooFewArgumentsException 
	 * @throws TooManyArgumentsException 
	 * 
	 */
	
	public static void main(String[] args) throws IOException, IllegalSyntaxException, UnavailableAdressException, TooManyArgumentsException, TooFewArgumentsException
	{
		
		File f = new File("script.ps");
		
		if(!f.exists())
		{
			
			FileWriter w = new FileWriter(f);
			w.write("");
			w.close();
			
			System.exit(0);
			
		}
		
		Scanner sc = new Scanner(f);
		
		if(!sc.nextLine().startsWith("WHAT ARE YOU DOING STEPBRO!!"))
			throw new IllegalSyntaxException("Every pornscript folder should start with the classic opening: \n WHAT ARE YOU DOING STEPBRO!!");
		else
			new Validator().validateScanner(sc);
		
	}

}
