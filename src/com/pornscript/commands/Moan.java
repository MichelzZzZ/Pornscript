package com.pornscript.commands;

import com.pornscript.interfaces.Command;

public class Moan 
{

	/**
	 * 
	 * The moan command will iterate through all arguments <br>
	 * validate them and print them to the console.
	 * 
	 */
	
	public static final Command i = (args, vsRefrence) -> 
	{
		
		for(int i = 1; i < args.length; i++)
			System.out.print(vsRefrence.validateText(args[i]));
		
		System.out.println();
		
	};
	
}
