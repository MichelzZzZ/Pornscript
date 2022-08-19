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

package com.pornscript.process;

import java.util.HashMap;
import java.util.Scanner;

import com.pornscript.exceptions.IllegalSyntaxException;
import com.pornscript.exceptions.TooFewArgumentsException;
import com.pornscript.exceptions.TooManyArgumentsException;
import com.pornscript.exceptions.UnavailableAdressException;
import com.pornscript.interfaces.Command;

/**
 * 
 * The validator is mainly responsible for running the pornscript <br>
 * program. It contains a hashmap of valid keywords. And an instance <br>
 * of the vairable store <br>
 * It's <mark>validateScanner()</mark> method is reposniable for checking the code <br>
 * line by line an sending the commands to the <mark>runCommand()</mark> method <br>
 * 
 */

public class Validator 
{

	private HashMap<String, Command> keywords;
	private VariableStore vs;
	
	/**
	 * 
	 * Constructor <br><br>
	 * 
	 * Instaniate the keywords map and the vairable store
	 * 
	 */
	
	Validator()
	{
		
		keywords = new HashMap<String, Command>();
		
		keywords.put("moan", Command.print);
		keywords.put("put", Command.put);
		
		vs = new VariableStore();
		
	}
	
	/**
	 * 
	 * iterates through the code line by lin and runs each command <br>
	 * note that the ":" symbol is used to split arguments of the <br>
	 * command
	 * 
	 * @param sc
	 * @throws IllegalSyntaxException
	 * @throws UnavailableAdressException 
	 * @throws TooFewArgumentsException 
	 * @throws TooManyArgumentsException 
	 */
	
	void validateScanner(Scanner sc) throws IllegalSyntaxException, UnavailableAdressException, TooManyArgumentsException, TooFewArgumentsException
	{
		
		while(sc.hasNextLine())
			runCommand(sc.nextLine().split(":"));
		
	}
	
	/**
	 *
	 * first, lowercase the keyword to avoid case sensetivity <br>
	 * next, check: if the line is empty, avoid it<br>
	 * then check: if it's a comment, avoid it<br>
	 * finally, check if the keyword is valid. run it<br>
	 * if it isn't valid throw an exception<br>
	 * 
	 * @param args
	 * @throws IllegalSyntaxException
	 * @throws UnavailableAdressException 
	 * @throws TooFewArgumentsException 
	 * @throws TooManyArgumentsException 
	 * 
	 */
	
	private void runCommand(String[] args) throws IllegalSyntaxException, UnavailableAdressException, TooManyArgumentsException, TooFewArgumentsException
	{
		
		String keyword = args[0].toLowerCase();

		if(keyword.equals(""))
			return;
		
		if(keyword.startsWith("//"))
			return;
		
		if(keywords.containsKey(keyword))
			keywords.get(keyword).run(args, vs);
		else
			throw new IllegalSyntaxException(keyword + " isn't a valid keyword");
		
	}

}
