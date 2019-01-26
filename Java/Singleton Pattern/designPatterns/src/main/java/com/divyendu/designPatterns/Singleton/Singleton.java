package com.divyendu.designPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.divyendu.designPatterns.models.Person;

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
	 * Coded to invoke only the default constructor of the passed instance type
	 * 
	 * [Usage]  Singleton instance1 = Singleton.getSingleInstance(Person.class);
	 * 			Singleton instance2 = Singleton.getSingleInstance(Person.class);
	 * 				instance1 is same as instance2
	 * 			Person p1 = (Person)instance1.getInnerInstance();
	 * 			Person p2 = (Person)instance2.getInnerInstance();
	 * 				p1 is also same as p2
	 * 
	 * @return Singleton - Unique instance of Singleton class
	 */
	public static <T>Singleton getSingleInstance(Class<T> clazz) {
		if(!instance) {
			instance = true;
			try {
				Constructor[] ctors = clazz.getDeclaredConstructors();
				Constructor ctor = null;
				for (int i = 0; i < ctors.length; i++) {
				    ctor = ctors[i];
				    if (ctor.getGenericParameterTypes().length == 0)
				    	break;
				}
				T innerInstance = (T)ctor.newInstance();
			
				uniqueInstance = new Singleton();
				uniqueInstance.setUniqueInnerInstance(innerInstance);
			}catch(InvocationTargetException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return uniqueInstance;
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
