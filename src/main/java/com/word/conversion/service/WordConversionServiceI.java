package com.word.conversion.service;


/**
 * The Interface WordConversionServiceI.
 * 
 * @author Artur Platek
 */
public interface WordConversionServiceI {

	/**
	 * Convert a number and give the equivalent number in british words.
	 *
	 * @param number the number used for calculation
	 * @return the string. Returns the equivalent number in british words,
	 * 						throws IllegalArgumentException
	 */
	String convert(int number);
}
