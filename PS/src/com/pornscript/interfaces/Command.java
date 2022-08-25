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
package com.pornscript.interfaces;

import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAddressException;
import com.pornscript.process.VariableStore;

/**
 * 
 * Each command has one methods 'run()' that takes a set of arguments and
 * and does a specfic task based on them. the method also needs refrence to the 
 * variable store in case it was needed <br>
 * 
 * The command interface has implementation in com.ponrscript.commands.
 * 
 */

@FunctionalInterface public interface Command
{

	public abstract void run(String[] args, VariableStore vsRefrence) throws UnavailableAddressException, TooManyArgumentsException, TooFewArgumentsException;
	
}
