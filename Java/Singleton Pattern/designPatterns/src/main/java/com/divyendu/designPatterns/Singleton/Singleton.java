package com.divyendu.designPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.divyendu.helper.PatternHelper;

/**
 * Singleton Pattern impl in Java for generic type M
 * Type of creational pattern. Focuses on:
 * 1. How objects are created
 * 2. Isolate the object creation details itself.
 * 3. Code Independent of the type of object to be created
 * 
 * @author divyendu
 *
 */
public class Singleton<M> {
	private M uniqueInnerInstance; 
	private static Singleton uniqueInstance;
	private static boolean instance;
	
	//make the constructor private so that clients can't create an instance of it
	private Singleton() {}
	
	/**
	 * Checks whether an instance exists, if it does then return the existing instance otherwise return a new
	 * instance. Creates and sets the M::uniqueInnerInstance type of the passed instance type. 
	 * Coded to invoke any constructor of the passed instance type based on the call
	 * 
	 * [Usage]  Object[] constructorArgs = {1,"Hyundai"};
	 * 			Singleton carInstance1 = Singleton.getSingleInstance(Car.class, constructorArgs);
	 * 			Car c1 = (Car)carInstance1.getInnerInstance();
	 * 			Object[] constructorArgs2 = {2,"Volvo"};
	 * 			Singleton carInstance2 = Singleton.getSingleInstance(Car.class, constructorArgs2);
	 * 			Car c2 = (Car)carInstance2.getInnerInstance();
	 * 				carInstance1 is same as carInstance2
	 * 				c1 is same as c2
	 * 			
	 * 			If second argument passed to getSingleInstance() is null, then invoke default constructor
	 * 
	 * @return Singleton - Unique instance of Singleton class
	 */
	public static <T>Singleton getSingleInstance(Class<T> clazz, Object[] constructorArgs) {
		if(!instance) {
			instance = true;
			Constructor<?> ctor = null;
			try {
				if(null == constructorArgs || constructorArgs.length == 0) {
					ctor = clazz.getDeclaredConstructor();
				}else {
					Class[] args = new Class[constructorArgs.length];
					for(int i=0; i<constructorArgs.length; i++) {
						args[i] = PatternHelper.toWrapper(constructorArgs[i].getClass());
					}
					ctor = clazz.getDeclaredConstructor(args);
				}
				T innerInstance = (T)ctor.newInstance(constructorArgs);
			
				uniqueInstance = new Singleton();
				uniqueInstance.setUniqueInnerInstance(innerInstance);
			}catch(InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
		return uniqueInstance;
	}
	
	/**
	 * Allows client to free the Singleton instance so that client can get a single unique instance of 
	 * another type
	 */
	public static void freeInstance() {
		System.out.println("Freed existing instance");
		instance = false;
	}
	
	/* making this method private since only getSingleInstance() should be allowed to set the inner instance type 
	*/
	private void setUniqueInnerInstance(M uniqueInnerInstance) {
		this.uniqueInnerInstance = uniqueInnerInstance;
	}

	public M getInnerInstance() {
		return this.uniqueInnerInstance;
	}
	
	
}
