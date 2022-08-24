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
 * The put less command substracts two numbers. it expects exactly
 * three arguments.<br>
 * 
 * <ol>
 * 		<li> The 'put less' keyword </li>
 * 		<li> The first number </li>
 * 		<li> The second number </li>
 * </ol>
 * 
 */

public class PutLess implements Command
{

	@Override
	public void run(String[] args, VariableStore vsRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException 
	{


		if(args.length < 3)
			throw new TooFewArgumentsException("the put less command expects exactly three arguments");
		
		if(args.length > 3)
			throw new TooManyArgumentsException("the put less command expects exactly three arguments");

		
		vsRefrence.substractVariable(args[1], args[2]);
		
	};

}
