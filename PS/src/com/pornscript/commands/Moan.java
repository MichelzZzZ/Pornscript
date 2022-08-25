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
package com.pornscript.commands;

import java.util.Scanner;

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
	public void run(String[] args, VariableStore vsRefrence, Scanner scRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException 
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
		
		System.out.println();
		
		// Add a line break after every moan command
		
	};
	
}
