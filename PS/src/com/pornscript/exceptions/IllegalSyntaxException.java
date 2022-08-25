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

public class IllegalSyntaxException extends Exception
{

	private static final long serialVersionUID = -2197994026693935046L;

	/**
	 * 
	 * This exceptions is thrown 
	 * 
	 * <ul>
	 * 
	 *		<li> by the EntryPoint class when it doesn't find the classic pornscript opening "WHAT ARE YOU DOING STEPBRO!!" </li>
	 * 		<li> by the Validator class when it finds an invalid keyword </li>
	 * 
	 * </ul>
	 *
	 */
	
	public IllegalSyntaxException(String str)
	{
		
		super(str);
		
	}
	
}
