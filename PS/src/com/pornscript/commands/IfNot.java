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
 *  If two strings/numbers aren't equal do something
 * 
 */

public class IfNot implements Command
{

	@Override
	public void run(String[] args, VariableStore vsRefrence, Scanner scRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException 
	{

		if(args.length < 3)
			throw new TooFewArgumentsException("the 'if i don't have' command expects exactly three arguments");
		
		if(args.length > 3)
			throw new TooManyArgumentsException("the 'if i don't have' command expects exactly three arguments");
		
		
		// If the condition is true
		
		if(vsRefrence.isEqual(args[1], args[2]))
			
			// Keep poping lines from the code until it reaches a break statement
			
			while(!scRefrence.nextLine().startsWith("break my vagina"));
		
		/*
		 * 
		 * Otherwise if the statement is false, it will normally execute the code
		 * between the if statement and the break statement
		 * 
		 */
		
	};
	
}
