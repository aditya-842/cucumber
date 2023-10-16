package com.qa.util;
import java.util.Date;
import org.apache.commons.lang3.*;
public class UniqueKeyGenerator {
	

	/**
	 * Gets unique random integer for given no. of digits.
	 * @param iNumberOfDigits Number of digits.
	 * @return Returns unique random integer as string for given no. of digits.
	 */
	public static String getRandomInteger(int iNumberOfDigits){	
		return RandomStringUtils.randomNumeric(iNumberOfDigits);
	}

	/**
	 * Gets unique random alphabetic for given no. of characters.
	 * @param iNumberOfCharacters Number of characters.
	 * @return Returns unique random alphabetic for given no. of characters.
	 */
	public static String getRandomString(int iNumberOfCharacters){	
		return RandomStringUtils.randomAlphabetic(iNumberOfCharacters);
	}

	/**
	 * Gets unique random alphanumeric for given no. of characters.
	 * @param iNumberOfCharacters Number of characters.
	 * @return Returns unique random alphanumeric for given no. of characters.
	 */
	public static String getrandomAlphanumericString(int iNumberOfCharacters){	
		return RandomStringUtils.randomAlphanumeric(iNumberOfCharacters);
	}
	
	/**
	 * @param date1 and date2 inputs.
	 * @return return a negative integer/zero/positive integer if date1 is considered less than/the same as/greater than date2 respectively.
	 */
	public static int compareDate(Date date1,Date date2){	
		return date1.compareTo(date2);
	}

}
