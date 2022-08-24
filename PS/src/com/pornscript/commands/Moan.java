/**
 * 
 * Pornscript
 * 
 * -----------------------------------------------------------------------------------------
 * 
 * an esoteric programming language that is designed to make programming dirty.
 * Pornscript is in it's early stage and needs a lot to work on. The language is written in 
 * Java means you can run it on most operating systems.
 * 
 * I. Process:
 * 
 * 		1 - The pornscript program starts executing at the EntryPoint class which checks for basic things.
 * 		does the script file exist? does it contain the classic opening "WHAT ARE YOU DOING STEPBRO!!"?
 * 
 * 		2 - After that, the code goes to the validator. Which reads the code line by line, throw errors
 * 		if there's an invalid keyword. It's also where comments and empty lines gets ignored
 *  	
 *  	  - Second step is also done by the help of another class called the VairableStore, which is obiously
 *  		responsible for dealing with variables
 *  
 * II. Packages:
 * 
 * 		com.pornscript.commands
 * 				contains implementations of 'com.pornscript.interfaces.Command'. This package is home to
 * 				all keyword used by pornscript
 * 
 * 		com.pornscript.exceptions
 * 				contains extensions of 'java.lang.Exception' class. There lies some possible exceptions 
 * 				thrown by pornscript
 * 
 * 		com.pornscript.interfaces
 * 				for now it only contains the "Command" interface which takes a set of arguments and do a
 *				task based on them
 *
 * 		com.pornscript.process
 * 				This contains the entry point, validator and variable store
 * 
 * -----------------------------------------------------------------------------------------
 * 
*/
package com.pornscript.commands;

import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAddressException;
import com.pornscript.interfaces.Command;
import com.pornscript.process.VariableStore;

/**
 * 
 * The moan command takes infinity set of arguments and prints them
 * to the console
 * 
 */

public class Moan implements Command
{

	@Override
	public void run(String[] args, VariableStore vsRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException 
	{

		// iterate through all arguments and print them
		
		for(int i = 1; i < args.length; i++)
			
		/*
		 * 
		 * Instead of using a foreach loop i used a dynamic loop that
		 * starts at index 1
		 * To avoid printing the first argument which is the 'moan'
		 * command it self
		 * 
		 */
			
			System.out.print(vsRefrence.deformatText(args[i]));
		
		/*
		 * 
		 * deformating helps to print text properly. For example when it says 
		 * "i will show you my tits". it should'nt exactly print that scentence. 
		 * instead, it should print the value of the tits variable
		 * 
		 * Text deformating is done in the VariableStore class
		 * 
		 * 
		 */
		
	};
	
}
