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

import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAddressException;
import com.pornscript.interfaces.Command;
import com.pornscript.process.VariableStore;

/**
 * 
 * The put more command adds two numbers. it expects exactly
 * three arguments.<br>
 * 
 * <ol>
 * 		<li> The 'put more' keyword </li>
 * 		<li> The first number </li>
 * 		<li> The second number </li>
 * </ol>
 * 
 */

public class PutMore implements Command
{

	@Override
	public void run(String[] args, VariableStore vsRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException 
	{
		

		if(args.length < 3)
			throw new TooFewArgumentsException("the put more command expects exactly three arguments");
		
		if(args.length > 3)
			throw new TooManyArgumentsException("the put more command expects exactly three arguments");
		
		
		vsRefrence.addVariable(args[1], args[2]);
		
	};

}
