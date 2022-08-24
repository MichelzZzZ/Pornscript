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
package com.pornscript.process;

import java.util.HashMap;
import java.util.Scanner;

import com.pornscript.commands.Moan;
import com.pornscript.commands.Put;
import com.pornscript.commands.PutLess;
import com.pornscript.commands.PutMore;
import com.pornscript.commands.Squeeze;
import com.pornscript.exceptions.IllegalSyntaxException;
import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAddressException;
import com.pornscript.interfaces.Command;

/**
 * 
 * The validator is mainly responsible for validating the code and 
 * checking for invalid keywords
 * 
 */

public class Validator 
{
	
	/**
	 * 
	 * A hashtable containing all pornscript keywords. This is used by the validator
	 * to tell if a keyword is valid or not
	 * 
	 */
	
	private HashMap<String, Command> keywords;
	
	/**
	 * 
	 * Refrence to the variable store
	 * 
	 */
	
	private VariableStore vs;
	
	Validator()
	{
		
		/*
		 * 
		 * Add all valid keywords the keyword hashmap
		 * 
		 */
		
		keywords = new HashMap<String, Command>();
		
		keywords.put("moan", new Moan());
		keywords.put("put", new Put());
		keywords.put("put more", new PutMore());
		keywords.put("put less", new PutLess());
		keywords.put("squeeze", new Squeeze());
		
		/*
		 * 
		 * Instantiate the variable store
		 * 
		 */
		
		vs = new VariableStore();
		
	}

	/**
	 * 
	 * iterate through the pornscript file, line by line. and call the runCommand() method for
	 * each line.
	 * 
	 * @param sc
	 * @throws IllegalSyntaxException
	 * @throws UnavailableAddressException
	 * @throws TooManyArgumentsException
	 * @throws TooFewArgumentsException
	 * 
	 */
	void iterateThroughScanner(Scanner sc) throws IllegalSyntaxException, UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException
	{
		
		while(sc.hasNextLine())
			runCommand(sc.nextLine().split(":"));
		// Arguments of the command are seperated by a colon
		
	}
	
	/**
	 *
	 * This method will be called once per line. it checks certian conditions<br>
	 *
	 * <ol>
	 * 		<li> is it an empty line? ignore </li>
	 * 		<li> is it a comment? ignore </li>
	 * 		<li> is it a valid keyword? run </li>
	 * </ol>
	 * 
	 * if it's neither an empty line nor a comment nor a valid keyword. throw an illegal syntax
	 * exception
	 * 
	 */
	
	private void runCommand(String[] args) throws IllegalSyntaxException, UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException
	{
		
		String keyword = args[0];

		
		// 1 - check for empty line
		if(keyword.equals(""))
			return;
		
		// 2 - check for comments
		if(keyword.startsWith("cumment"))
			return;
		
		// 3 - check for a valid keyword
		if(keywords.containsKey(keyword))
			keywords.get(keyword).run(args, vs);

		
		// if it is neither of the above throw an exception
		throw new IllegalSyntaxException(keyword + " isn't a valid keyword");
		
	}

}
