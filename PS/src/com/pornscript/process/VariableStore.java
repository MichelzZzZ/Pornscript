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
package com.pornscript.process;

import java.util.Random;
import java.util.Scanner;

import com.pornscript.exceptions.UnavailableAddressException;

/**
 * 
 * The variable store is <mark>obviously</mark> used to store variable<br>
 * 
 * in pornscript. you don't define variables, but there are four pre-defined variables<br>
 * 
 * <ol>
 * 		<li> between the tits </li>
 * 		<li> in the butt </li>
 * 		<li> in the pussy </li>
 * 		<li> in the mouth </li>
 * </ol>
 *
 */

public class VariableStore 
{
	

	private Scanner sc;
	private Random rnd;
	
	/**
	 * 
	 * This one-dememnsional array of string is where all pornscript variables are stored in fact<br>
	 * 
	 * index 0 = the tits variable<br>
	 * index 1 = the butt variable<br>
	 * index 2 = the pussy variable<br>
	 * index 3 = the mouth variable<br>
	 * 
	 */
	
	private String[] vars;
	
	// Constructor
	
	VariableStore()
	{
		
		sc = new Scanner(System.in);
		rnd = new Random();
		vars = new String[4];
		
	}
	
	/**
	 * 
	 * This is used to deformat text before printing it. <br>
	 * 
	 * If it says "i will show you my tits" print the tits variable <br>
	 * If it says "i will show you my butt" print the butt variable <br>
	 * If it says "i will show you my pussy" print the pussy variable <br>
	 * If it says "i will show you my mouth" print the mouth variable <br>
	 * If it says "your dick" ask for user input <br>
	 * If it says "a random amount" generate a random number between 0 and 100 <br>
	 * otherwise it's just a plain unformated text
	 * 
	 */
	public String deformatText(String str)
	{
		
		switch(str)
		{
		
		case "i will show you my tits" 	: return vars[0];
		case "i will show you my butt" 	: return vars[1];
		case "i will show you my pussy" : return vars[2];
		case "i will show you my mouth" : return vars[3];
		case "your dick"				: return sc.nextLine();
		case "a random amount"			: return String.valueOf(rnd.nextInt(0, 100));
		default: return str;
		
		}
		
	}
	
	/**
	 * 
	 * This method deformats a variable name (tits, butt, pussy, mouth) to it's index (0, 1, 2, 3)
	 * 
	 * 
	 */
	private int deformatAddress(String str) throws UnavailableAddressException
	{
		
		switch(str)
		{
		
		case "between my tits" 	: return 0;
		case "in my butt" 		: return 1;
		case "in my pussy" 		: return 2;
		case "in my mouth" 		: return 3;
		default: throw new UnavailableAddressException(str + " is not a valid address");
		
		}
		
	}
	
	
	
	// Used by the put command

	public void setVariable(String content, String index) throws UnavailableAddressException
	{
		
		vars[deformatAddress(index)] = deformatText(content);
				
	}

	// Used by the squeeze command
	
	public void concatVariable(String content, String index) throws UnavailableAddressException
	{
		
		vars[deformatAddress(index)] += deformatText(content);
				
	}
	
	// Used by the 'if i have' and 'if i dont have' command
	
	public boolean isEqual(String content, String index) throws UnavailableAddressException
	{
			
		return vars[deformatAddress(index)].equals(deformatText(content));
			
	}
	
	// Used by the 'if i have more' command
	
	public boolean isLarger(String content, String index) throws UnavailableAddressException
	{
		
		String a = deformatText(content);
		String b = vars[deformatAddress(index)];
		
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
		
		
		return bInt >= aInt;
			
	}
	// Used by the 'if i have less than' command
	
	public boolean isSmaller(String content, String index) throws UnavailableAddressException
	{
			
		String a = deformatText(content);
		String b = vars[deformatAddress(index)];
			
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
			
		return bInt <= aInt;
				
	}
	// Used by the put more command
	
	public void add(String content, String index) throws UnavailableAddressException
	{

		String a = deformatText(content);
		String b = vars[deformatAddress(index)];

		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
	
		
		vars[deformatAddress(index)] = String.valueOf(bInt + aInt);
		
	}

	// Used by the put less command
	
	public void substract(String content, String index) throws UnavailableAddressException
	{
		
		String a = deformatText(content);
		String b = vars[deformatAddress(index)];
		
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
		
		
		vars[deformatAddress(index)] = String.valueOf(bInt - aInt);
		
	}

}
