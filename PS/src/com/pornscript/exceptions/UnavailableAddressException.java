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
