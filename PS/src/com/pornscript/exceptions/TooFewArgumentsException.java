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
package com.pornscript.exceptions;

public class TooFewArgumentsException extends Exception
{

	private static final long serialVersionUID = 8114874698588253831L;

	/**
	 * 
	 * This exception is thrown when a keyword expects a specific
	 * amount of arguments and gets too few<br>
	 * 
	 * used by the following keywords
	 * 
	 * <ul>
	 * 		<li> put </li>
	 * 		<li> put more </li>
	 * 		<li> put less </li>
	 * 		<li> squeeze </li>
	 * </ul>
	 *
	 */
	
	public TooFewArgumentsException(String str)
	{
		
		super(str);
		
	}
	
}
