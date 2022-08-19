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

import java.util.Scanner;

import com.pornscript.exceptions.UnavailableAdressException;

/**
 * 
 * The variable store is <mark>obviously</mark> used to store variables <br><br>
 * 
 * in pornscript. you can temporarly store vairables between the tits, in the butt <br>
 * in the pussy or in the mouth <br><br>
 * 
 * The variable store uses a one dimension array of string. where <br><br>
 * 
 * index 0 = tits <br>
 * index 1 = butt <br>
 * index 2 = pussy <br>
 * index 3 = mouth <br>
 * 
 * @author Michel
 *
 */
public class VariableStore 
{
	
	private Scanner sc;
	private String[] vars;
	
	/**
	 * 
	 * Constructor <br>
	 * 
	 * Instantiate the system input scanner and the string array
	 * 
	 */
	VariableStore()
	{
		
		sc = new Scanner(System.in);
		vars = new String[4];
		
	}
	
	/**
	 * 
	 * This is used to validate a text before printing it. <br> <br>
	 * 
	 * If it says "moan:i will show you my tits" print the tits variable <br>
	 * If it says "moan:i will show you my butt" print the butt variable <br>
	 * If it says "moan:i will show you my pussy" print the pussy variable <br>
	 * If it says "moan:i will show you my mouth" print the mouth variable <br>
	 * If it says "moan:your input" ask for user input <br><br>
	 * 
	 * If it says "moan:something else" print it as a plain text<br>
	 * for example "moan:hello world" would print hello world<br>
	 * 
	 * @param str
	 * @return
	 * 
	 */
	public String validateText(String str)
	{
		
		switch(str)
		{
		
		case "i will show you my tits" 	: return vars[0];
		case "i will show you my butt" 	: return vars[1];
		case "i will show you my pussy" : return vars[2];
		case "i will show you my mouth" : return vars[3];
		case "your input"				: return sc.nextLine();
		default: return str;
		
		}
		
	}
	
	/**
	 * 
	 * This validates a variable address<br>
	 * used with the "put" command<br>
	 * 
	 * if it says "put:something:between my tits" 		add it to index 0<br>
	 * if it says "put:something:in my butt" 			add it to index 1<br>
	 * if it says "put:something:in my pussy"	 		add it to index 2<br>
	 * if it says "put:something:in my mouth"			add it to index 3<br><br>
	 * 
	 * else throw an unavailable adress Exception
	 * 
	 */
	public int validateAddress(String str) throws UnavailableAdressException
	{
		
		switch(str)
		{
		
		case "between my tits" 	: return 0;
		case "in my butt" 		: return 1;
		case "in my pussy" 		: return 2;
		case "in my mouth" 		: return 3;
		default: throw new UnavailableAdressException(str + " is not a valid address");
		
		}
		
	}
	
	/**
	 * 
	 * this sets a variable. used with the *put command*<br><br>
	 * 
	 * it will ask for an index, which will be validated with the validateAddress() method<br>
	 * and content which will be validated witht eh validateText() method<br><br>
	 * 
	 * <h1>examples:</h1><br><br>
	 * 
	 * <mark>put:hello world:in my butt</mark><br>
	 * will store "hello world" at the butt variable<br><br>
	 * 
	 * <mark>put:your input:in my butt</mark><br>
	 * will ask for user input and store at the butt vaiables<br><br>
	 * 
	 * <mark>put:i will show you my tits:in my butt</mark><br>
	 * will copy the value at the tits variable to the butt variable<br><br>
	 * 
	 * @param content
	 * @param index
	 * @throws UnavailableAdressException 
	 * @throws Exception
	 * 
	 */
	
	public void setVariable(String content, String index) throws UnavailableAdressException
	{
		
		vars[validateAddress(index)] = validateText(content);
				
	}

}
