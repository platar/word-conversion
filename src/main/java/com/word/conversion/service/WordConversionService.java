package com.word.conversion.service;

import static com.word.conversion.constants.WordConstants.BIG_NUMBER_STRING;
import static com.word.conversion.constants.WordConstants.HUNDRED;
import static com.word.conversion.constants.WordConstants.LOW_NUMBER_STRING;
import static com.word.conversion.constants.WordConstants.TENS_NUMBER_STRING;


/**
 * The Class WordConversionService.
 * 
 * @author Artur Platek
 */
public class WordConversionService implements WordConversionServiceI {

	/* (non-Javadoc)
	 * @see com.ink.global.service.WordConversionServiceI#convert(int)
	 */
	public String convert(int n) {
		if (n < 0) {
			throw new IllegalArgumentException(String.valueOf(n));
		}
		if (n <= 999) {
			return convert999(n);
		}
		String s = null;
		int t = 0;
		while (n > 0) {
			if (n % 1000 != 0) {
				String s2 = convert999(n % 1000);
				if (t > 0) {
					s2 = s2 + " " + BIG_NUMBER_STRING[t - 1];
				}
				if (s == null) {
					s = s2;
				} else {
					s = s2 + " " + s;
				}
			}
			n /= 1000;
			t++;
		}
		return s;
	}

 
	/**
	 * Convert999 converts range 0-999.
	 *
	 * @param n the n
	 * @return the string
	 */
	private String convert999(int n) {
		String s1 = LOW_NUMBER_STRING[n / 100] + " " + HUNDRED;
		String s2 = convert99(n % 100);
		if (n <= 99) {
			return s2;
		} else if (n % 100 == 0) {
			return s1;
		} else {
			return s1 + " " + s2;
		}
	}

	/**
	 * Convert999 converts range 0-99.
	 *
	 * @param n the n
	 * @return the string
	 */
	private  String convert99(int n) {
		if (n < 20) {
			return LOW_NUMBER_STRING[n];
		}
		String s = TENS_NUMBER_STRING[n / 10 - 2];
		if (n % 10 == 0) {
			return s;
		}
		return s + " " + LOW_NUMBER_STRING[n % 10];
	}

}
