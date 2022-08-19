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

package com.pornscript.interfaces;

import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAdressException;
import com.pornscript.process.VariableStore;

/*
 * 
 * Each command takes an array of arugments <br>
 * and perform a task based on them
 * 
 */

@FunctionalInterface public interface Command
{

	public abstract void run(String[] args, VariableStore vsRefrence) throws UnavailableAdressException, TooManyArgumentsException, TooFewArgumentsException;
	
	
	
	/*
	 * 
	 * 
	 * Commands list
	 * 
	 * 
	 */
	
	/**
	 * 
	 * The print <mark>"moan"</mark> will iterate through all arguments <br>
	 * validate them and print them to the console.
	 * 
	 */
	
	public static final Command print = (args, vsRefrence) -> 
	{
		
		for(int i = 1; i < args.length; i++)
			System.out.print(vsRefrence.validateText(args[i]));
		
		System.out.println();
		
	};
	
	/**
	 * 
	 * The put command will first chech that it exactly has three arguments <br><br>
	 * 
	 * if it have less than three throw TooFewArgumentsException<br>
	 * if it have more than three throw TooManyArgumentsException<br><br>
	 * 
	 * if it exactly have three arguments, call the setVariable() method<br>
	 * from the variable store.
	 * 
	 */
	
	public static final Command put = (args, vsRefrence) ->
	{
		
		if(args.length < 3)
			throw new TooFewArgumentsException("the put command needs exactly three arguments");
		
		if(args.length > 3)
			throw new TooManyArgumentsException("the put command needs exactly three arguments");
		
		
		vsRefrence.setVariable(args[1], args[2]);
		
	};
	
}
