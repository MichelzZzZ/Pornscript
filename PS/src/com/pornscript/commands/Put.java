package com.pornscript.commands;

import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.interfaces.Command;

public class Put 
{
	
	/**
	 * 
	 * The put command will first chech that it exactly has three arguments <br><br>
	 * 
	 * if it have less than three throw TooFewArgumentsException<br>
	 * if it have more than three throw TooManyArgumentsException<br><br>
	 * 
	 * if it exactly have three arguments, call the setVariable() method<br>
	 * from the variable store.
	 * 
	 */
	
	public static final Command i = (args, vsRefrence) ->
	{
		
		if(args.length < 3)
			throw new TooFewArgumentsException("the put command needs exactly three arguments");
		
		if(args.length > 3)
			throw new TooManyArgumentsException("the put command needs exactly three arguments");
		
		
		vsRefrence.setVariable(args[1], args[2]);
		
	};

}
