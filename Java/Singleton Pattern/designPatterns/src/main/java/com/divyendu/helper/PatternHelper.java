package com.divyendu.helper;

public class PatternHelper {

	public static Class<?> toWrapper(Class<?> clazz) {
//	    if (!clazz.isPrimitive())
//	        return clazz;

	    if (clazz == Integer.class)
	        return int.class;
	    if (clazz == Long.class)
	        return long.class;
	    if (clazz == Boolean.class)
	        return boolean.class;
	    if (clazz == Byte.class)
	        return byte.class;
	    if (clazz == Character.class)
	        return char.class;
	    if (clazz == Float.class)
	        return float.class;
	    if (clazz == Double.class)
	        return double.class;
	    if (clazz == Short.class)
	        return short.class;
	    if (clazz == Void.class)
	        return void.class;

	    return clazz;
	}
}
