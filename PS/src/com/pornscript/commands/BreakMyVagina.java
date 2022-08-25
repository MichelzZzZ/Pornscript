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
 * The 'break my vagina' keyword is used to break out of statements and loops. 
 * The 'break my vagina' command on it's own doesn't do anything. But it's used by other commands
 * 
 */

public class BreakMyVagina implements Command
{

	@Override
	public void run(String[] args, VariableStore vsRefrence, Scanner scRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException 
	{

		if(args.length > 1)
			throw new TooManyArgumentsException("the 'break my vagina' command expects no arguments");
		
	};
	
}
