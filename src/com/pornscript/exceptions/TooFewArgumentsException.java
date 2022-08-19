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

package com.pornscript.exceptions;

public class TooFewArgumentsException extends Exception
{

	public TooFewArgumentsException(String str)
	{
		
		super(str);
		
	}
	
}
