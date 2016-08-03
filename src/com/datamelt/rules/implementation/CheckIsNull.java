/*
 * Created on 15.09.2006
 *
 * all code by uwe geercken
 */
package com.datamelt.rules.implementation;

import java.util.Date;

/**
 * checks if a given value is NULL or
 * equals the the string "null" or "Null"
 * 
 * <p>
 * The first argument of a method is always the value of the field that one wants to check. The second argument is either another field 
 * or an expected (fixed) value to check against the first value.
 * </p>
 * <p>
 * Some methods may have additional arguments that can be passed to it.
 * </p>
 * 
 * @author uwe geercken
 */
public class CheckIsNull extends GenericCheck
{
	/**
     * checks, if the string is not null and does not equal the
     * string "null" or "Null"
     */
    public static boolean evaluate(String value)
    {
        if(value==null || value.toLowerCase().trim().equals("null"))
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    public static boolean evaluate(long value)
    {
    	Long longValue = value;
   		return longValue == null;
    }
    
    public static boolean evaluate(int value)
    {
    	Integer integerValue = value;
    	return integerValue == null;
    }
    
    public static boolean evaluate(double value)
    {
    	Double doubleValue = value;
    	return doubleValue==null;
    }
    
    public static boolean evaluate(float value)
    {
    	Float floatValue = value;
    	return floatValue==null;
    }
    
    public static boolean evaluate(Date value)
    {
    	if(value==null)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
}
