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
package com.pornscript.exceptions;

public class UnavailableAddressException extends Exception
{

	private static final long serialVersionUID = 1449607175421791476L;

	/**
	 * 
	 * This exception is thrown when the user tries to access a variable that isn't one of
	 * the main four varibales:
	 * 
	 * <ul>
	 * 		<li> The tits </li>
	 * 		<li> The butt </li>
	 * 		<li> The pussy </li>
	 * 		<li> The mouth </li>
	 * </ul>
	 *
	 */
	
	public UnavailableAddressException(String str)
	{
		
		super(str);
		
	}
	
}
